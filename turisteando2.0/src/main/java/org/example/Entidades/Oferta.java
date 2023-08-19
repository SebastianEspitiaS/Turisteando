package org.example.Entidades;

import java.time.LocalDate;

import org.example.utilidades.Util;
import org.example.validaciones.OfertaValidacion;

public class Oferta {

    private Integer id;
    private String titulo;
    private String descripcion;
    private LocalDate fechaInicial;
    private LocalDate fechaFinal;
    private Double costoPersona;
    private Local local;
    protected Util util = new Util();
    protected OfertaValidacion validacion = new OfertaValidacion();

    public Oferta() {
    }

    public Oferta(Integer id, String titulo, String descripcion, LocalDate fechaInicial,
            LocalDate fechaFinal, Double costoPersona, Local local) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.costoPersona = costoPersona;
        this.local = local;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = util.idAleatorio();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        try {
            validacion.validarTitulo(titulo);
            this.titulo = titulo;
        } catch (Exception error) {
            System.out.println("\u001B[31m" + error.getMessage() + "\u001B[0m");
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(String fechaInicial) {
        try {
            util.validarFormatoFecha(fechaInicial);
            this.fechaInicial = LocalDate.parse(fechaInicial, util.formatoFecha);
        } catch (Exception error) {
            System.out.println("\u001B[31m" + error.getMessage() + "\u001B[0m");
        }
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        try {
            util.validarFormatoFecha(fechaFinal);
            if (fechaInicial != null) {
                validacion.validarConsistenciaFecha(getFechaInicial(), LocalDate.parse(fechaFinal, util.formatoFecha));
                this.fechaFinal = LocalDate.parse(fechaFinal, util.formatoFecha);
            }
        } catch (Exception error) {
            System.out.println("\u001B[31m" + error.getMessage() + "\u001B[0m");
        }
    }

    public Double getCostoPersona() {
        return costoPersona;
    }

    public void setCostoPersona(Double costoPersona) {
        try {
            validacion.validarCostoPersona(costoPersona);
            this.costoPersona = costoPersona;
        } catch (Exception error) {
            System.out.println("\u001B[31m" + error.getMessage() + "\u001B[0m");
        }
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
