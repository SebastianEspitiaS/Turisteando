package org.example.Entidades;

import org.example.Entidades.Interfaces.Ireporte;

public class EntidadCultural extends Empresa implements Ireporte {
    String mision;

    public EntidadCultural(){}

    public EntidadCultural(Integer id, String nit, String nombre, Integer ubicacion, String descripcion, String mision) {
        super(id, nit, nombre, ubicacion, descripcion);
        this.mision = mision;
    }

    public String getMision() {
        return mision;
    }

    public void setMision(String mision) {
        this.mision = mision;
    }

    //@Override
    public Boolean cobrar() {
        return null;
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
