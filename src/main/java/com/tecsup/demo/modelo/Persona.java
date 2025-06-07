package com.tecsup.demo.modelo;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters y setters
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
}
