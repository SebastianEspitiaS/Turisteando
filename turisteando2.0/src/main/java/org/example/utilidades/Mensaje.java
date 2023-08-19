package org.example.utilidades;

public enum Mensaje {
    NUMERO_CARACTERES_INVALIDO("Número de caracteres inválido"),
    NOMBRE_INVALIDO("Solo se aceptan letras en el nombre"),
    CORREO_INVALIDO("Correo no válido"),
    UBICACION_INVALIDA("La ubicacion solo puede ser un numero entre 1 y 4"),
    NUMERO_DOCUMENTO_INVALIDO("El numero del documento es invalido"),
    SOLO_NUMEROS_DOCUMENTO("El documento solo puede tener numeros"),
    NOMBRE_lOCAL_INVALIDO("El nombre no puede ser mayor a 30 caracteres"),
    TITULO_INVALIDO("El titulo no puede ser mayor a 20 caracteres"),
    FORMATO_FECHA_INVALIDO("La fecha tiene que estar en formato 'dd/MM/yyyy'"),
    INCONSISTENCIA_FECHA("La fecha de inicio no puede ser mayor a la fecha de fin"),
    COSTO_INVALIDO("El costo no puede ser menor a 0"),
    NUMERO_RESERVAS_INVALIDA("Solo se aceptan 4 personas por reserva");
    private String mensaje;

    Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
