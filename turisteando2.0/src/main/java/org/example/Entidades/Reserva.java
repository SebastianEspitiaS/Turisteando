package org.example.Entidades;

import java.time.LocalDate;

import org.example.utilidades.Util;
import org.example.validaciones.ReservaValidacion;

public class Reserva {

    private Integer id;
    private Usuario usuario;
    private Oferta oferta;
    private Double costoTotal;
    private LocalDate fecha;
    private Integer numeroPersonas = 0;
    protected Util util = new Util();
    protected ReservaValidacion validacion = new ReservaValidacion();

    public Reserva() {
    }

    public Reserva(Integer id, Usuario usuario, Oferta oferta, Double costoTotal, LocalDate fecha,
            Integer numeroPersonas) {
        this.id = id;
        this.usuario = usuario;
        this.oferta = oferta;
        this.costoTotal = costoTotal;
        this.fecha = fecha;
        this.numeroPersonas = numeroPersonas;
    }

    public Integer getId() {
        return id;
    }

    public void setId() {
        this.id = util.idAleatorio();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Integer getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(Integer numeroPersonas) {
        try {
            validacion.validarNumeroPersonas(numeroPersonas);
            this.numeroPersonas = numeroPersonas;
        } catch (Exception error) {
            System.out.println("\u001B[31m" + error.getMessage() + "\u001B[0m");
        }
    }

    public Oferta getOferta() {
        return oferta;
    }

    public void setOferta(Oferta oferta) {
        this.oferta = oferta;
    }

    public Double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(Double costoTotal) {
        this.costoTotal = costoTotal + (costoTotal * 0.19);
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        try {
            util.validarFormatoFecha(fecha);
            this.fecha = LocalDate.parse(fecha, util.formatoFecha);
        } catch (Exception error) {
            System.out.println("\u001B[31m" + error.getMessage() + "\u001B[0m");
        }
    }
}
