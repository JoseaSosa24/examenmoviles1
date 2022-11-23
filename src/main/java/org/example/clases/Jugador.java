package org.example.clases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

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

    public void editarJugador(int opcionEditar, Jugador jugador){
        Scanner read = new Scanner(System.in);
        switch (opcionEditar) {

            case 1:
                System.out.print("Digite Número Camisa: ");
                jugador.setNumeroCamiseta(read.next());
                System.out.println("¡Nùmero de Camisa actualizado correctamente!");
                break;
            case 2:
                System.out.print("Digite Nombre: ");
                jugador.setNombre(read.next());
                System.out.println("¡Nombre actualizado correctamente!");
                break;
            case 3:
                System.out.print("Digite Apellido: ");
                jugador.setApellido(read.next());
                System.out.println("¡Apellido actualizado correctamente!");
                break;
            case 4:
                System.out.print("Digite Posición: ");
                jugador.setPosicion(read.next());
                System.out.println("¡Posiciòn actualizado correctamente!");
                break;
            case 5:
                System.out.print("Digite Edad: ");
                jugador.setEdad(read.nextInt());
                System.out.println("¡Edad actualizada correctamente!");
                break;
            case 6:
                System.out.print("Digite Club: ");
                jugador.setNombreEquipo(read.next());
                System.out.println("¡Club actualizado correctamente!");
                break;
            default:
                System.out.println("Digite una opción valida");

        }//FIN CASE EDITAR
    }

    public Jugador(String numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public boolean buscarJugador(String numeroJugador) {
        return this.numeroCamiseta.equals(numeroJugador);
    }


    //    public boolean buscarJugador(){
//        return  this.numeroCamiseta.equals(numeroJugador);
//    }
    public void mostrarJugador() {
        System.out.print("\033[32m\n\nNúmero de camisa: " + this.numeroCamiseta+"\u001B[0m"
                + "\nNombre: \033[32m" + this.nombre+"\u001B[0m"
                + "\nAppellido: \033[32m" + this.apellido+"\u001B[0m"
                + "\nPosición: \033[32m" + this.posicion+"\u001B[0m"
                + "\nEdad: \033[32m" + this.edad+"\u001B[0m"
                + "\nClub: \033[32m" + this.nombreEquipo+"\u001B[0m");
    }

}




