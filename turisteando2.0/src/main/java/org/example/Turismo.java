package org.example;

import org.example.Entidades.Local;
import org.example.Entidades.Oferta;
import org.example.Entidades.Reserva;
import org.example.Entidades.Usuario;
import org.example.utilidades.Util;

import java.util.Scanner;

public class Turismo {

        public static void main(String[] args) {
                Util util = new Util();
                Usuario usuario = new Usuario();
                Local local = new Local();
                Reserva reserva = new Reserva();
                Oferta oferta = new Oferta();
                Scanner lea = new Scanner(System.in);

                System.out.println("\u001B[35m***Bienvenido***\u001B[0m");

                /**** Datos Usuario ****/
                System.out.println("\u001B[34m1.Datos del usuario\u001B[0m");
                System.out.print("Ingrese su nombre y apellidos: ");
                usuario.setNombres(lea.nextLine());
                System.out.print("Ingrese su numero de documento: ");
                usuario.setDocumento(lea.nextLine());
                System.out.print("Ingrese su correo electronico: ");
                usuario.setCorreo(lea.nextLine());
                System.out.print("Ingrese su ubicacion.\n" +
                                "Digite una de las opciones (centro(1), sur(2), norte(3), otras(4)): ");
                usuario.setUbicacion(lea.nextInt());
                lea.nextLine();// Limpiar buffer del scanner

                /**** Datos Local ****/
                System.out.println("\n\u001B[34m2.Datos del local\u001B[0m");
                System.out.print("Ingrese el nombre del Local: ");
                local.setNombre(lea.nextLine());
                System.out.print("Ingrese el nit del local: ");
                local.setNit(lea.nextLine());
                local.setId();

                /**** Datos Reserva ****/
                System.out.println("\u001B[34m3.Datos de la reserva\u001B[0m");
                System.out.print("Ingrese el dia de su reserva: ");
                reserva.setFecha(lea.nextLine());
                System.out.print("Ingrese el numero de personas en la reserva (50000 por persona): ");
                reserva.setNumeroPersonas(lea.nextInt());
                lea.nextLine(); // Limpiar buffer del scanner
                reserva.setCostoTotal(reserva.getNumeroPersonas() * 50000.00);

                /**** Datos Oferta ****/
                System.out.println("\u001B[34m4.Datos de la oferta\u001B[0m");
                System.out.print("Ingrese el titulo de la oferta: ");
                oferta.setTitulo(lea.nextLine());
                System.out.print("Ingrese el costo por persona: ");
                oferta.setCostoPersona(lea.nextDouble());
                lea.nextLine(); // Limpiar buffer del scanner
                System.out.print("Ingrese la fecha de inicio: ");
                oferta.setFechaInicial(lea.nextLine());
                System.out.print("Ingrese la ficha de fin: ");
                oferta.setFechaFinal(lea.nextLine());
                lea.close();

                /**** Imprimir Datos ****/
                System.out.println(
                                "\n\n\u001B[35m**** Imprimir Datos ****\u001B[0m" + "\n\nNombre del Usuario: "
                                                + usuario.getNombres()
                                                + "\nDocumento del usuario: " + usuario.getDocumento()
                                                + "\nCorreo del usuario: "
                                                + usuario.getCorreo() + "\nUbicacion del usuario: "
                                                + usuario.getUbicacion()
                                                + "\n\nNombre del local: " + local.getNombre() + "\nId del local: "
                                                + local.getId()
                                                + "\nNit del local: " + local.getNit() + "\n\nDia de reserva: "
                                                + util.muestraFeha(reserva.getFecha())
                                                + "\nNumero de personas en la reserva: "
                                                + reserva.getNumeroPersonas() + "\nCosto por persona de la reserva: "
                                                + reserva.getCostoTotal()
                                                + "\n\nTitulo de la oferta: " + oferta.getTitulo()
                                                + "\nCosto por persona oferta: "
                                                + oferta.getCostoPersona() + "\nFecha de inicio de la oferta: "
                                                + util.muestraFeha(oferta.getFechaInicial())
                                                + "\nFecha final de la oferta: "
                                                + util.muestraFeha(oferta.getFechaFinal()));
        }
}