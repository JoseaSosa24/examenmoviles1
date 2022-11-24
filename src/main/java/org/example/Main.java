package org.example;

import org.example.clases.Jugador;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String black = "\033[30m", red = "\033[31m", green = "\033[32m", yellow = "\033[33m", blue = "\033[34m",
                cyan = "\033[36m", reset = "\u001B[0m";

        Scanner read = new Scanner(System.in);
        Main principal = new Main();
        Jugador objetoJugador;
        ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
        int opcionMenu;
        System.out.print(cyan + "\n*******************************************************");
        System.out.print("\n*******SISTEMA DE CONVOCATORIA SELECCIÓN COLOMBIA*******");
        System.out.print("\n*******************************************************\n");

        do {
            System.out.print(cyan + "\n*******MENÚ DE OPCIONES*******\n");
            System.out.print(" Digita tu opción: \n");
            System.out.println("1. AGREGAR JUGADOR"
                    + "\n2.BUSCAR JUGADOR POR NÙMERO DE CAMISETA"
                    + "\n3.EDITAR JUGADOR"
                    + "\n4.MOSTRAR CONVOCATORIA DE LOS JUGADORES"
                    + "\n5.SALIR" + reset);
            opcionMenu = read.nextInt();

            if (!jugadores.isEmpty() || opcionMenu == 1 || opcionMenu == 5) {
                switch (opcionMenu) {
                    case 1:
                        if (jugadores.size() == 6) {
                            System.out.println(yellow + "No se permiten agregar más jugadores a la convocatoria, máximo 23" + reset);
                        } else {
                            System.out.println(cyan + "\n************AGREGANDO JUGADOR***********\n" + reset);
                            objetoJugador = new Jugador();
                            objetoJugador.agregarJugador();
                            if (objetoJugador.buscarJugador(jugadores, objetoJugador.getNumeroCamiseta()) == null) {
                                jugadores.add(objetoJugador);
                                System.out.print(green + "¡Jugador agregado a la convocatoria correctamente!\n" + reset);
                            } else {
                                System.err.println("Y hay un jugador que tiene el número de camisa ingresado");
                            }
                        }
                        System.out.println("-->Presione ENTER para continuar<--");
                        System.in.read();
                        break;
                    case 2:
                        objetoJugador = new Jugador();
                        System.out.println(cyan + "************BUSCANDO JUGADOR***********\n" + reset);
                        System.out.print("Ingrese número de camiseta del Jugador a buscar: ");
                        String numeroCamisaBuscar = read.next();
                        Jugador jugadorEncontrado;
                        jugadorEncontrado = objetoJugador.buscarJugador(jugadores, numeroCamisaBuscar);
                        if (jugadorEncontrado != null) {
                            System.out.println(green+"¡Jugador encontrado!"+reset);
                            jugadorEncontrado.mostrarJugador();
                        } else {
                            System.err.println("Jugador No encontrado\n");
                        }
                        System.out.println("\n-->Presione ENTER para continuar<--");
                        System.in.read();
                        break;
                    case 3:
                        objetoJugador = new Jugador();
                        System.out.println(cyan + "************EDITANDO JUGADOR***********\n" + reset);
                        System.out.print("Ingrese número del Jugador a Editar: ");
                        String numeroCamisaEditar = read.next();
                        Jugador jugadorEditar;
                        jugadorEditar = objetoJugador.buscarJugador(jugadores, numeroCamisaEditar);
                        int opcionEditar;
                        if (jugadorEditar != null) {
                            do {
                                System.out.print(cyan+"\n**Datos del Jugador:** "+reset);
                                jugadorEditar.mostrarJugador();
                                System.out.println("");
                                System.out.println(cyan + "\nSeleccione el campo a Editar:"
                                        + "\n1.Número Camisa"
                                        + "\n2.Nombre"
                                        + "\n3.Apellido"
                                        + "\n4.Posición"
                                        + "\n5.Edad"
                                        + "\n6.Club"
                                        + "\n7.Para volver al Menú principal" + reset);
                                opcionEditar = read.nextInt();
                                objetoJugador = new Jugador();
                                opcionEditar = objetoJugador.editarJugador(opcionEditar, jugadorEditar);

                            } while (opcionEditar != 7);
                        } else {
                            System.err.println("Jugador No encontrado\n");
                            System.out.println("-->Presione ENTER para continuar<--");
                            System.in.read();
                        }
                        break;
                    case 4:

                        System.out.print(cyan + "\n*********JUGADORES CONVOCADOS***********" + reset);
                        for (Jugador jugador : jugadores) {
                            jugador.mostrarJugador();
                        }
                        System.out.println(reset + "\n-->Presione ENTER para continuar<--");
                        System.in.read();
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("Digite una opción valida");
                        System.out.println("-->Presione ENTER para continuar<--");
                        System.in.read();
                        break;
                }//FIN CASE PRINCIPAL
            } else if (opcionMenu <= 0 || opcionMenu > 5) {
                System.err.println("Digite una opción vàlida");
                System.out.println("-->Presione ENTER para intentar de nuevo<--");
                System.in.read();
            } else {
                System.out.println(yellow + "Debe ingresar Jugadores primero" + reset);
                System.out.println("->Presione ENTER para intentar de nuevo<--");
                System.in.read();
            }

        } while (opcionMenu != 5);

    }


}