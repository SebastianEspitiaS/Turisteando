package org.example.Entidades;

import org.example.utilidades.Util;
import org.example.validaciones.UsuarioValidacion;

public abstract class Usuario {

    private Integer id;
    private String documento;
    private String nombres;
    private String correo;
    private Integer ubicacion;
    Util util = new Util();
    protected UsuarioValidacion validacion = new UsuarioValidacion();

    public Usuario() {
    }

    public Usuario(Integer id, String documento, String nombres, String correo, Integer ubicacion) {
        this.id = id;
        this.documento = documento;
        this.nombres = nombres;
        this.correo = correo;
        this.ubicacion = ubicacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId() {
        this.id = util.idAleatorio();
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        try {
            validacion.validarNit(documento);
            this.documento = documento;
        } catch (Exception error) {
            System.out.println("\u001B[31m" + error.getMessage() + "\u001B[0m");
        }
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        try {
            validacion.validarNombres(nombres);
            this.nombres = nombres;
        } catch (Exception error) {
            System.out.println("\u001B[31m" + error.getMessage() + "\u001B[0m");
        }
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        try {
            validacion.validarCorreo(correo);
            this.correo = correo;
        } catch (Exception error) {
            System.out.println("\u001B[31m" + error.getMessage() + "\u001B[0m");
        }
    }

    public Integer getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Integer ubicacion) {
        try {
            validacion.validarUbicacion(ubicacion);
            this.ubicacion = ubicacion;
        } catch (Exception error) {
            System.out.println("\u001B[31m" + error.getMessage() + "\u001B[0m");
        }
    }

    public abstract Boolean registar();
}
