package org.example.validaciones;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.example.utilidades.Mensaje;

class UsuarioValidacionTest {

    // crear un objeto de la clase que quiero probar

    protected UsuarioValidacion validacion;

    // Preparar las pruebas que se van a realizar

    @BeforeEach
    public void configurarPruebas() {
        this.validacion = new UsuarioValidacion();
        System.out.println("Iniciando prueba...");
    }

    // Programar pruebas unitarias

    @Test
    public void validarNombresFuncionaCorrectamente() {
        String nombrePrueba = "Sebastian Espitia Sanchez"; // preparo la funcion
        Boolean respuesta = Assertions.assertDoesNotThrow(() -> this.validacion.validarNombres(nombrePrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarNombresFuncionaIncorrectosPorNumerosCaracteres() {
        String nombrePrueba = "Sebastian";
        Exception respuesta = Assertions.assertThrows(Exception.class,
                () -> this.validacion.validarNombres(nombrePrueba));
        Assertions.assertEquals(Mensaje.NUMERO_CARACTERES_INVALIDO.getMensaje(), respuesta.getMessage());
    }

    @Test
    public void validarNombresFuncionaIncorrectosPorCaractereInvalidos() {
        String nombrePrueba = "seba";
        Exception respuesta = Assertions.assertThrows(Exception.class,
                () -> this.validacion.validarNombres(nombrePrueba));
        Assertions.assertEquals(Mensaje.NUMERO_CARACTERES_INVALIDO.getMensaje(), respuesta.getMessage());
    }

    @Test
    public void validarCorreoFuncionaCorrectamente() {
        String correoPrueba = "sebastian@gmail.com";
        Boolean respuesta = Assertions.assertDoesNotThrow(() -> this.validacion.validarCorreo(correoPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarCorreoFuncionaIncorrectamente() {
        String correoPrueba = "correo.com";
        Exception respuesta = Assertions.assertThrows(Exception.class,
                () -> this.validacion.validarCorreo(correoPrueba));
        Assertions.assertEquals(Mensaje.CORREO_INVALIDO.getMensaje(), respuesta.getMessage());
    }

    @Test
    public void validarUbicacionCorrecta() {
        Integer ubicacionPrueba = 4;
        Boolean respuesta = Assertions.assertDoesNotThrow(() -> this.validacion.validarUbicacion(ubicacionPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarUbicacionIncorrecta() {
        Integer ubicacionPrueba = 5;
        Exception respuesta = Assertions.assertThrows(Exception.class, ()-> this.validacion.validarUbicacion(ubicacionPrueba));
        Assertions.assertEquals(Mensaje.UBICACION_INVALIDA.getMensaje(),respuesta.getMessage());
    }

}
