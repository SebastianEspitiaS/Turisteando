package org.example.Entidades;

import org.example.Entidades.Interfaces.Ireporte;
import org.example.validaciones.OcacionalValidacion;

public class Ocacional extends Usuario implements Ireporte {
    private Integer valorEvento;

    private OcacionalValidacion validacion = new OcacionalValidacion();

    public Ocacional() {
    }

    //@Override
    public Boolean registar() {
        return null;
    }

    public Ocacional(Integer id, String documento, String nombres, String correo, Integer ubicacion,
            Integer valorEvento) {
        super(id, documento, nombres, correo, ubicacion);
        this.valorEvento = valorEvento;
    }

    public Integer getValorEvento() {
        return valorEvento;
    }

    public void setValorEvento(Integer valorEvento) {
        try {
            this.validacion.validarvalorEvento(valorEvento);
            this.valorEvento = valorEvento;
        } catch (Exception e) {
            System.out
                    .println("\u001B[31m" + e.getMessage() + "\u001B[0m");
        }
    }


    @Override
    public void generarReporte() {

    }

    @Override
    public void editarReporte(Integer id, String nuevoReporte) {

    }

    @Override
    public void buscarReporte(Integer id) {

    }
}

