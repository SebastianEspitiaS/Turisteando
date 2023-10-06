package org.example.Controladores;

import org.example.Entidades.Usuario;
import org.example.Servicios.ServicioUsuario;
import org.example.Modelos.ModeloUsuario;

import java.util.List;

public class ControladorUsuario {
    private Usuario usuario = new Usuario(); //valida datos de un nuevo usuario
    private ServicioUsuario servicioUsuario = new ServicioUsuario();

    public void registrarUsuario(String documento, String nombre, String correo, Integer ubicacion){
        usuario.setNombres(nombre);
        usuario.setCorreo(correo);
        usuario.setDocumento(documento);
        usuario.setUbicacion(ubicacion);
        this.servicioUsuario.grardarDatosBd(usuario);
    }

    public void consultarUsuario(){
        List<ModeloUsuario> usuarios = this.servicioUsuario.consultarDatosBd(usuario);
        System.out.println(usuarios);
    }

    /*public void consultarUsuario(){
    }*/
}
