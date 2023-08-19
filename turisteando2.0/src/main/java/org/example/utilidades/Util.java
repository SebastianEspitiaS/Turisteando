package org.example.utilidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util {

    public DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public String muestraFeha(LocalDate fecha) {
        if (fecha != null) {
            return fecha.format(formatoFecha);
        } else {
            return null;
        }
    }

    public boolean validarExpresionRegular(String cadena, String expresionRegular) {
        Pattern patron = Pattern.compile(expresionRegular);
        Matcher coincidencia = patron.matcher(cadena);
        if (coincidencia.matches()) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean validarFormatoFecha(String fecha) throws Exception {
        if (!validarExpresionRegular(fecha, "^[0-9]{2}/[0-9]{2}/[0-9]{4}$")) {
            throw new Exception(Mensaje.FORMATO_FECHA_INVALIDO.getMensaje());
        } else {
            return true;
        }
    }

    public Integer idAleatorio() {
        Integer idAleatorio = (int) (Math.random() * 501);
        return idAleatorio;
    }
}
