package org.example;

import org.example.Controladores.ControladorUsuario;
/*import org.example.Entidades.Afiliado;
import org.example.Entidades.Empresa;
import org.example.Entidades.Oferta;
import org.example.Entidades.Reserva;
import org.example.utilidades.Util;*/

import java.util.Scanner;

public class Turismo {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        ControladorUsuario controladorUsuario = new ControladorUsuario();
        controladorUsuario.registrarUsuario("1234567890", "Sebastian Espitia Sanchez", "sebastian@gmail.com", 2);

    }

    // private static final Scanner lea = new Scanner(System.in);
    // private static final Util util = new Util();

    // public static void main(String[] args) {
    // System.out.println("\u001B[35m***Bienvenido***\u001B[0m");

    // Usuario usuario = obtenerDatosUsuario();
    // Empresa local = obtenerDatosLocal();
    // Reserva reserva = obtenerDatosReserva();
    // Oferta oferta = obtenerDatosOferta();

    // imprimirDatos(usuario, local, reserva, oferta);

    // lea.close();
    // }

    // private static Usuario obtenerDatosUsuario() {
    // Usuario usuario = new Usuario();
    // System.out.println("\u001B[34m1.Datos del usuario\u001B[0m");
    // System.out.print("Ingrese su nombre y apellidos: ");
    // usuario.setNombres(lea.nextLine());
    // System.out.print("Ingrese su numero de documento: ");
    // usuario.setDocumento(lea.nextLine());
    // System.out.print("Ingrese su correo electronico: ");
    // usuario.setCorreo(lea.nextLine());
    // System.out.print("Ingrese su ubicacion (centro(1), sur(2), norte(3),
    // otras(4)): ");
    // usuario.setUbicacion(lea.nextInt());
    // lea.nextLine();
    // return usuario;
    // }

    // private static Empresa obtenerDatosLocal() {
    // Empresa local = new Empresa();
    // System.out.println("\n\u001B[34m2.Datos del local\u001B[0m");
    // System.out.print("Ingrese el nombre del Empresa: ");
    // local.setNombre(lea.nextLine());
    // System.out.print("Ingrese el nit del local: ");
    // local.setNit(lea.nextLine());
    // local.setId();
    // return local;
    // }

    // private static Reserva obtenerDatosReserva() {
    // Reserva reserva = new Reserva();
    // System.out.println("\u001B[34m3.Datos de la reserva\u001B[0m");
    // System.out.print("Ingrese el dia de su reserva: ");
    // reserva.setFecha(lea.nextLine());
    // System.out.print("Ingrese el numero de personas en la reserva (50000 por
    // persona): ");
    // reserva.setNumeroPersonas(lea.nextInt());
    // lea.nextLine();
    // reserva.setCostoTotal(reserva.getNumeroPersonas() * 50000.00);
    // return reserva;
    // }

    // private static Oferta obtenerDatosOferta() {
    // Oferta oferta = new Oferta();
    // System.out.println("\u001B[34m4.Datos de la oferta\u001B[0m");
    // System.out.print("Ingrese el titulo de la oferta: ");
    // oferta.setTitulo(lea.nextLine());
    // System.out.print("Ingrese el costo por persona: ");
    // oferta.setCostoPersona(lea.nextDouble());
    // lea.nextLine();
    // System.out.print("Ingrese la fecha de inicio: ");
    // oferta.setFechaInicial(lea.nextLine());
    // System.out.print("Ingrese la ficha de fin: ");
    // oferta.setFechaFinal(lea.nextLine());
    // return oferta;
    // }

    // private static void imprimirDatos(Usuario usuario, Empresa local, Reserva
    // reserva, Oferta oferta) {
    // System.out.println("\n\n\u001B[35m**** Imprimir Datos ****\u001B[0m" +
    // "\n\nNombre del Usuario: " + usuario.getNombres() +
    // "\nDocumento del usuario: " + usuario.getDocumento() +
    // "\nCorreo del usuario: " + usuario.getCorreo() +
    // "\nUbicacion del usuario: " + usuario.getUbicacion() +
    // "\n\nNombre del local: " + local.getNombre() +
    // "\nId del local: " + local.getId() +
    // "\nNit del local: " + local.getNit() +
    // "\n\nDia de reserva: " + util.muestraFeha(reserva.getFecha()) +
    // "\nNumero de personas en la reserva: " + reserva.getNumeroPersonas() +
    // "\nCosto por persona de la reserva: " + reserva.getCostoTotal() +
    // "\n\nTitulo de la oferta: " + oferta.getTitulo() +
    // "\nCosto por persona oferta: " +oferta.getCostoPersona() +
    // "\nFecha de inicio de la oferta: " +
    // util.muestraFeha(oferta.getFechaInicial()) +
    // "\nFecha final de la oferta: " + util.muestraFeha(oferta.getFechaFinal()));
    // }
}
