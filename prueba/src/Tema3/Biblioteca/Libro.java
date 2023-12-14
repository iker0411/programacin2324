package Tema3.Biblioteca;

import java.util.Objects;

public class Libro {
    private String nombre;
    private String autor;

    private String sinopsis;

    private int numEjemplares;
    private int ejemplaresDisponibles;

    public Libro(String nombre, String autor, String sinopsis, int numEjemplares, int ejemplaresDisponibles) {
        this.nombre = nombre;
        this.autor = autor;
        this.sinopsis = sinopsis;
        this.numEjemplares = numEjemplares;
        this.ejemplaresDisponibles = ejemplaresDisponibles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return Objects.equals(nombre, libro.nombre) && Objects.equals(autor, libro.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, autor);
    }
}
