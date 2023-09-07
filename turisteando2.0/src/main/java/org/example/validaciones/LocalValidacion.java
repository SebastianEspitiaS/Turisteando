package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.example.utilidades.Util;

public class LocalValidacion {
    protected Util util = new Util();

    public Boolean validarNit(String nit) throws Exception {
        if (nit.length() != 10) {
            throw new Exception(Mensaje.NUMERO_DOCUMENTO_INVALIDO.getMensaje());
        } else if (!util.validarExpresionRegular(nit, "^[0-9]+$")) {
            throw new Exception(Mensaje.SOLO_NUMEROS_DOCUMENTO.getMensaje());
        } else {
            return true;
        }
    }

    public Boolean validarNombre(String nombre) throws Exception {
        if (nombre.length() > 30) {
            throw new Exception(Mensaje.NOMBRE_lOCAL_INVALIDO.getMensaje());
        } else {
            return true;
        }
    }

}
