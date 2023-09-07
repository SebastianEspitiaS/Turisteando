package org.example.validaciones;

import static org.junit.jupiter.api.Assertions.*;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LocalValidacionTest {

    private LocalValidacion validacion;

    @BeforeEach
    public void setUp() {
        validacion = new LocalValidacion();
    }

    @Test
    public void testValidarNitCorrectLength() throws Exception {
        assertTrue(validacion.validarNit("1234567890"));
    }

    @Test
    public void testValidarNitIncorrectLength() {
        Exception exception = assertThrows(Exception.class, () -> {
            validacion.validarNit("123456789");
        });

        assertEquals(Mensaje.NUMERO_DOCUMENTO_INVALIDO.getMensaje(), exception.getMessage());
    }

    @Test
    public void testValidarNitNonNumeric() {
        Exception exception = assertThrows(Exception.class, () -> {
            validacion.validarNit("12345678a0");
        });

        assertEquals(Mensaje.SOLO_NUMEROS_DOCUMENTO.getMensaje(), exception.getMessage());
    }

    @Test
    public void testValidarNombreWithinLimit() throws Exception {
        assertTrue(validacion.validarNombre("Test Name"));
    }

    @Test
    public void testValidarNombreExceedLimit() {
        String longName = "This is a very long name which is more than 30 characters";
        Exception exception = assertThrows(Exception.class, () -> {
            validacion.validarNombre(longName);
        });

        assertEquals(Mensaje.NOMBRE_lOCAL_INVALIDO.getMensaje(), exception.getMessage());
    }

}
