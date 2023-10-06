package org.example.Servicios;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.Entidades.Usuario;
import org.example.Modelos.ModeloUsuario;

import java.util.List;

public class ServicioUsuario {
    //conexion con las entidades
    private EntityManagerFactory conexionEntidades;
    private EntityManager manejadorConexionEntidades ;
    public void conexion(){
        // Nombre documento de la entidad configurada en el ORM
        String persistenciaNombre = "conexionbd";
        //conexion con las entidades
        this.conexionEntidades = null;
        this.manejadorConexionEntidades = null;

        conexionEntidades = Persistence.createEntityManagerFactory(persistenciaNombre);
        manejadorConexionEntidades =conexionEntidades.createEntityManager();
    }
    public void grardarDatosBd(Usuario usuario){

        try {
            conexion();

            ModeloUsuario modeloUsuario = new ModeloUsuario();

            modeloUsuario.setNombres(usuario.getNombres());
            modeloUsuario.setDocumentos(usuario.getDocumento());
            modeloUsuario.setCorreo(usuario.getCorreo());
            modeloUsuario.setUbicaciones(usuario.getUbicacion());

            manejadorConexionEntidades.getTransaction().begin();
            manejadorConexionEntidades.persist(modeloUsuario);
            manejadorConexionEntidades.getTransaction().commit();

            System.out.println("Registro Exitoso");

        }catch (Exception error){
            error.getStackTrace();

        }finally{
            if(manejadorConexionEntidades!=null){
                manejadorConexionEntidades.close();
            }
        }

    }

    public List<ModeloUsuario> consultarDatosBd(Usuario usuario){

        try{
            conexion();
            String consulta = "SELECT modelousuario ModeloUsuario modelousuario";

            List<ModeloUsuario> usuarios = manejadorConexionEntidades.createQuery(consulta, ModeloUsuario.class).getResultList();
            return usuarios;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }finally {
            conexionEntidades.close();
        }
    }


}
