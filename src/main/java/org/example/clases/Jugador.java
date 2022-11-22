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
        System.out.print("Digita el Club donde juega Jugador: ");
        this.nombreEquipo = read.next();
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
        System.out.print("\n\nNúmero de camisa: " + this.numeroCamiseta
                + "\nNombre: " + this.nombre
                + "\nAppellido: " + this.apellido
                + "\nPosición: " + this.posicion
                + "\nEdad: " + this.edad
                + "\nClub: " + this.nombreEquipo);
    }

}
