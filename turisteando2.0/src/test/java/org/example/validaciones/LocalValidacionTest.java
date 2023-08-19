package org.example.validaciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LocalValidacionTest {

    protected LocalValidacion validacion;

    @BeforeEach
    public void configurarPruebas(){
        this.validacion = new LocalValidacion();
        System.out.println("Iniciando Pruebas...");
    }


    @Test
    void validarNitCorrecto() {
        String nit = "1234567890";
    }

    @Test
    void validarNombreCorrecto() {
    }
}