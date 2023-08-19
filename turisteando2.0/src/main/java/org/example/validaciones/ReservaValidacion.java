package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.example.utilidades.Util;

public class ReservaValidacion {
    Util util = new Util();

    public Boolean validarNumeroPersonas(Integer numeroPersona) throws Exception{
        if (numeroPersona > 4) {
            throw new Exception(Mensaje.NUMERO_RESERVAS_INVALIDA.getMensaje());
        } else{
            return true;
        }
    }
}
