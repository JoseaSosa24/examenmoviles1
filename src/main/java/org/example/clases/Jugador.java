package org.example.clases;

public class Jugador {

    private String nombre, apellido, nombreEquipo, numeroCamiseta,posicion;
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


}
