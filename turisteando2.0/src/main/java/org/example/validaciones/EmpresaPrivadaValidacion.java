package org.example.validaciones;
import org.example.utilidades.Mensaje;

public class EmpresaPrivadaValidacion {
    public Boolean validarRepLegal(String rep_legal) throws Exception{
        if (rep_legal.length() < 10){
            throw new Exception(Mensaje.NOMBRE_REPRESENTANTE_INVALIDO.getMensaje());
        }
        else{
            return true;
        }
    }
}


//200000 base + iva -10% cultural
//lo mismo pero sin 10%