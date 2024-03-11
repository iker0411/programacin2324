package Tema5.Boletin6_1.Ejercicio7;

import java.util.HashSet;

public class Ingrediente {
    private String nombre;
    private double cantidad;

    public String getNombre() {
        return nombre;
    }

    public Ingrediente(String nombre, double cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public  double getCantidad(){
        return cantidad;
    }

    public void addCantidad (double annadir){
        cantidad += annadir;
    }
}
