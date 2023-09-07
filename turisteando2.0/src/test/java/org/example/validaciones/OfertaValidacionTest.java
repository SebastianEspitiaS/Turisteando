package org.example.validaciones;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

class OfertaValidacionTest {

    private OfertaValidacion ofertaValidacion;

    @BeforeEach
    void setUp() {
        ofertaValidacion = new OfertaValidacion();
    }

    // Test for validarTitulo

    @Test
    void validarTitulo_validTitle_returnsTrue() throws Exception {
        assertTrue(ofertaValidacion.validarTitulo("Valid Title"));
    }

    @Test
    void validarTitulo_longTitle_throwsException() {
        Exception exception = assertThrows(Exception.class, () -> ofertaValidacion.validarTitulo("This is a really long title that should throw an exception"));
        assertEquals("Título inválido.", exception.getMessage());  // Assuming this is the translation of Mensaje.TITULO_INVALIDO
    }

    // Test for validarConsistenciaFecha

    @Test
    void validarConsistenciaFecha_validDates_returnsTrue() throws Exception {
        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 12, 31);
        assertTrue(ofertaValidacion.validarConsistenciaFecha(startDate, endDate));
    }

    @Test
    void validarConsistenciaFecha_inconsistentDates_throwsException() {
        LocalDate startDate = LocalDate.of(2023, 12, 31);
        LocalDate endDate = LocalDate.of(2023, 1, 1);
        Exception exception = assertThrows(Exception.class, () -> ofertaValidacion.validarConsistenciaFecha(startDate, endDate));
        assertEquals("Inconsistencia de fecha.", exception.getMessage());  // Assuming this is the translation of Mensaje.INCONSISTENCIA_FECHA
    }

    // Test for validarCostoPersona

    @Test
    void validarCostoPersona_validCost_returnsTrue() throws Exception {
        assertTrue(ofertaValidacion.validarCostoPersona(100.0));
    }

    @Test
    void validarCostoPersona_negativeCost_throwsException() {
        Exception exception = assertThrows(Exception.class, () -> ofertaValidacion.validarCostoPersona(-100.0));
        assertEquals("Costo inválido.", exception.getMessage());  // Assuming this is the translation of Mensaje.COSTO_INVALIDO
    }
}
