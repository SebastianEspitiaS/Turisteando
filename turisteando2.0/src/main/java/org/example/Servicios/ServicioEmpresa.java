package org.example.Servicios;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.Entidades.Empresa;
import org.example.Modelos.ModelosEmpresa;

public class ServicioEmpresa {
    public void grardarDatosBd(Empresa empresa){
        // Nombre documento de la entidad configurada en el ORM
        String persistenciaNombre = "conexionbd";

        //conexion con las entidades
        EntityManagerFactory conexionEntidades;
        EntityManager manejadorConexionEntidades = null;

        try {
            conexionEntidades = Persistence.createEntityManagerFactory(persistenciaNombre);
            manejadorConexionEntidades =conexionEntidades.createEntityManager();
            ModelosEmpresa modelosEmpresa = new ModelosEmpresa();

            modelosEmpresa.setNombre(empresa.getNombre());

            manejadorConexionEntidades.getTransaction().begin();
            manejadorConexionEntidades.persist(modelosEmpresa);
            manejadorConexionEntidades.getTransaction().commit();

        }catch (Exception error){
            error.getStackTrace();

        }finally{
            if(manejadorConexionEntidades!=null){
                manejadorConexionEntidades.close();
            }
        }

    }

}

