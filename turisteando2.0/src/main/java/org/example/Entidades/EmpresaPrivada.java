package org.example.Entidades;

import org.example.Entidades.Interfaces.Ireporte;
import org.example.validaciones.EmpresaPrivadaValidacion;

public class EmpresaPrivada extends Empresa implements Ireporte {

    private String rep_legal;
    private EmpresaPrivadaValidacion validacion = new EmpresaPrivadaValidacion();
    
    public EmpresaPrivada() {
    }

    public EmpresaPrivada(Integer id, String nit, String nombre, Integer ubicacion, String descripcion, String rep_legal) {
        super(id, nit, nombre, ubicacion, descripcion);
        this.rep_legal = rep_legal;
    }

    public String getRep_legal() {
        return rep_legal;
    }

    public void setRep_legal(String rep_legal) {
        try{
            validacion.validarRepLegal(rep_legal);
            this.rep_legal = rep_legal;
        }catch(Exception error){
            System.out.println("\u001B[31m" + error.getMessage() + "\u001B[0m");
        }
    }

    @Override
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
