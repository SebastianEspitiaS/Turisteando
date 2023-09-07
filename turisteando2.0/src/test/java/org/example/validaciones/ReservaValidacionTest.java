package org.example.validaciones;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReservaValidacionTest {

    private ReservaValidacion reservaValidacion;

    @BeforeEach
    public void setUp() {
        reservaValidacion = new ReservaValidacion();
    }

    @Test
    public void testValidarNumeroPersonas_CorrectNumber() throws Exception {
        Boolean result = reservaValidacion.validarNumeroPersonas(3);
        assertTrue(result);
    }

    @Test
    public void testValidarNumeroPersonas_MaxNumber() throws Exception {
        Boolean result = reservaValidacion.validarNumeroPersonas(4);
        assertTrue(result);
    }

    @Test
    public void testValidarNumeroPersonas_ExceedMaxNumber() {
        Exception exception = assertThrows(Exception.class, () -> {
            reservaValidacion.validarNumeroPersonas(5);
        });

        assertTrue(exception.getMessage().contains(Mensaje.NUMERO_RESERVAS_INVALIDA.getMensaje()));
    }
}
