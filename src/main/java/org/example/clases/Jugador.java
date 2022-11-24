package org.example.clases;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Jugador {

    private String nombre, apellido, nombreEquipo, numeroCamiseta, posicion;
    private int edad;

    public Jugador() {
    }

    public Jugador(String nombre, String apellido, String nombreEquipo, String numeroCamiseta, int edad, String posicion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nombreEquipo = nombreEquipo;
        this.numeroCamiseta = numeroCamiseta;
        this.edad = edad;
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(String numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }


    public void agregarJugador() {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite Número de la camiseta del Jugador: ");
        this.numeroCamiseta = read.next();
        System.out.print("Digite Nombre del Jugador: ");
        this.nombre = read.next();
        System.out.print("Digite Apellido del Jugador: ");
        this.apellido = read.next();
        System.out.print("Escriba la Posición del Jugador: ");
        this.posicion = read.next();
        System.out.print("Digita la Edad del Jugador: ");
        this.edad = read.nextInt();
        System.out.print("Digita el Club donde juega el Jugador: ");
        this.nombreEquipo = read.next();

    }

    public int editarJugador(int opcionEditar, Jugador jugador) throws IOException {
        Scanner read = new Scanner(System.in);
        switch (opcionEditar) {

            case 1:
                System.out.print("Digite Número Camisa: ");
                jugador.setNumeroCamiseta(read.next());
                System.out.println("\u001B[32m¡Nùmero de Camisa actualizado correctamente!\u001B[0m");
                System.out.println("¿Desea editar otro elemento? 0:Sí 7:NO");
                opcionEditar=read.nextInt();
                break;
            case 2:
                System.out.print("Digite Nombre: ");
                jugador.setNombre(read.next());
                System.out.println("\u001B[32m¡Nombre actualizado correctamente!\u001B[0m");
                System.out.println("¿Desea editar otro elemento? 0:Sí 7:NO");
                opcionEditar=read.nextInt();
                break;
            case 3:
                System.out.print("Digite Apellido: ");
                jugador.setApellido(read.next());
                System.out.println("\033[32m¡Apellido actualizado correctamente!\u001B[0m");
                System.out.println("¿Desea editar otro elemento? 0:Sí 7:NO");
                opcionEditar=read.nextInt();
                break;
            case 4:
                System.out.print("Digite Posición: ");
                jugador.setPosicion(read.next());
                System.out.println("\u001B[32m¡Posición actualizada correctamente!\u001B[0m");
                System.out.println("¿Desea editar otro elemento? 0:Sí 7:NO");
                opcionEditar=read.nextInt();
                break;
            case 5:
                System.out.print("Digite Edad: ");
                jugador.setEdad(read.nextInt());
                System.out.println("\u001B[32m¡Edad actualizada correctamente!\u001B[0m");
                System.out.println("¿Desea editar otro elemento? 0:Sí 7:NO");
                opcionEditar=read.nextInt();
                break;
            case 6:
                System.out.print("Digite Club: ");
                jugador.setNombreEquipo(read.next());
                System.out.println("\u001B[32m¡Club actualizado correctamente!\u001B[0m");
                System.out.println("¿Desea editar otro elemento? 0:Sí 7:NO");
                opcionEditar=read.nextInt();
                break;
            case 7:
                break;
            default:
                System.err.println("Digite una opción valida");
                System.out.println("->Presione ENTER para intentar de nuevo<--");
                System.in.read();

        }//FIN CASE EDITAR
        return opcionEditar;
    }

    public Jugador buscarJugador(ArrayList<Jugador> jugadores, String jugadorBuscar) {
        Jugador jugadorEncontrado=null;

        for (Jugador jugador: jugadores){
            if (jugador.getNumeroCamiseta().equals(jugadorBuscar)) {
                jugadorEncontrado =jugador;
                break;
            }
        }
        return jugadorEncontrado;
    }

    public void mostrarJugador() {
        System.out.println("\nNúmero de camisa: " + "\033[32m"+this.numeroCamiseta + "\u001B[0m"
                + "\nNombre: \033[32m" + this.nombre + "\u001B[0m"
                + "\nApellido: \033[32m" + this.apellido + "\u001B[0m"
                + "\nPosición: \033[32m" + this.posicion + "\u001B[0m"
                + "\nEdad: \033[32m" + this.edad + "\u001B[0m"
                + "\nClub: \033[32m" + this.nombreEquipo + "\u001B[0m ");
    }

}




