package org.example.validaciones;

import java.time.LocalDate;

import org.example.utilidades.Mensaje;
import org.example.utilidades.Util;

public class OfertaValidacion {
    Util util = new Util();


    public Boolean validarTitulo(String titulo)throws Exception{
        if (titulo.length() > 20) {
            throw new Exception(Mensaje.TITULO_INVALIDO.getMensaje());
        } else {
            return true;
        }
    }

    public Boolean validarConsistenciaFecha(LocalDate fechaInicio, LocalDate fechaFin) throws Exception{
        if (fechaFin.isBefore(fechaInicio)) {
            throw new Exception(Mensaje.INCONSISTENCIA_FECHA.getMensaje());
        } else {
            return true;
        }
    }

    public Boolean validarCostoPersona(Double costo)throws Exception{
        if (costo < 0){
            throw new Exception(Mensaje.COSTO_INVALIDO.getMensaje());
        }else {
            return true;
        }
    }
}
