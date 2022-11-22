package org.example;

import org.example.clases.Jugador;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Jugador objetoJugador = new Jugador();
        ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
        int opcionMenu;


        do {
            System.out.print("\n*******************************************************");
            System.out.print("\n*******SISTEMA DE INFORMACIÓN SELECCIÓN COLOMBIA*******");
            System.out.print("\n*******************************************************\n");
            System.out.print("\n*******MENÚ DE OPCIONES*******\n");
            System.out.print(" Digita tu opción: \n");
            System.out.println("1. AGREGAR JUGADOR"
                    + "\n2.BUSCAR JUGADOR POR NÙMERO DE CAMISETA"
                    + "\n3.EDITAR JUGADOR"
                    + "\n4.MOSTRAR CONVOCATORIA DE LOS JUGADORES"
                    + "\n5.SALIR");
            opcionMenu = read.nextInt();

            if (!jugadores.isEmpty() || opcionMenu == 1 || opcionMenu == 5) {
                switch (opcionMenu) {
                    case 1:
                        if (jugadores.size() == 23) {
                            System.out.println("No se permiten agregar más jugadores a la convocatoria, máximo 23");
                        } else {
                            objetoJugador = new Jugador();
                            objetoJugador.agregarJugador();
                            jugadores.add(objetoJugador);
                        }
                        break;
                    case 2:
                        System.out.print("Ingrese número del Jugador a buscar: ");
                        String numeroCamisaBuscar = read.next();
                        boolean encontrado = false;
                        for (Jugador jugador : jugadores) {
                            if (jugador.getNumeroCamiseta().equals(numeroCamisaBuscar)) {
                                System.out.print("Jugador encontrado");
                                jugador.mostrarJugador();
                                encontrado = true;
                                break;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("Jugador No encontrado");
                        }
                        break;
                    case 3:
                        System.out.print("Ingrese número del Jugador a Editar: ");
                        String numeroCamisaEditar = read.next();
                        boolean encontrado2 = false;
                        for (Jugador jugador : jugadores) {
                            if (jugador.getNumeroCamiseta().equals(numeroCamisaEditar)) {
                                int op;
                                System.out.print("Jugador encontrado");
                                do {
                                    jugador.mostrarJugador();
                                    System.out.println("");
                                    System.out.println("\nSeleccione el campo a Editar:"
                                            + "\n1.Número Camisa"
                                            + "\n2.Nombre"
                                            + "\n3.Apellido"
                                            + "\n4.Posición"
                                            + "\n5.Edad"
                                            + "\n6.Club"
                                            + "\n7.Salir");
                                    op = read.nextInt();

                                    switch (op) {

                                        case 1:
                                            System.out.print("Digite Número Camisa: ");
                                            jugador.setNumeroCamiseta(read.next());
                                            break;
                                        case 2:
                                            System.out.print("Digite Nombre: ");
                                            jugador.setNombre(read.next());
                                            break;
                                        case 3:
                                            System.out.print("Digite Apellido: ");
                                            jugador.setApellido(read.next());
                                            break;
                                        case 4:
                                            System.out.print("Digite Posición: ");
                                            jugador.setApellido(read.next());
                                            break;
                                        case 5:
                                            System.out.print("Digite Edad: ");
                                            jugador.setEdad(read.nextInt());
                                            break;
                                        case 6:
                                            System.out.print("Digite Club: ");
                                            jugador.setNombreEquipo(read.next());
                                            break;
                                        default:
                                            System.out.println("Digite una opción valida");

                                    }
                                } while (op != 7);

                                encontrado2 = true;
                                break;
                            }
                        }

                        if (!encontrado2) {
                            System.out.println("Jugador No encontrado");
                        }
                        break;
                    case 4:

                        System.out.print("*********JUGADORES CONVOCADOS***********");
                        for (Jugador jugador : jugadores) {
                            jugador.mostrarJugador();
                        }

                        break;
                    case 5:
//                        System.out.println("¿Seguro desea salir del programa?");

                        break;
                    default:
                        System.out.println("Digite una opción valida");
                        break;
                }
            } else if (opcionMenu <= 0 || opcionMenu > 5) {
                System.out.println("Digite una opción valida");
            } else {
                System.out.print("Debe ingresar Jugadores primero");
            }
//            System.out.println("\nPRESIONE CUALQUIER TECLA PARA CONTINUAR");
//            read.nextLine();

        } while (opcionMenu != 5);

    }

}