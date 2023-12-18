package Tema3.Biblioteca;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Prestamo {

    public static final int NUM_DIAS_PRESTAMO = 10;
    public static final int NUM_MAX_PRESTAMO = 3;
    private LocalDateTime fechainicio;
    private LocalDate fechaLimiteDevolucion;

    private LocalDateTime fechaRealDevolucion;

    private  Usuario usuario;
    private Libro libro;

    public Prestamo(LocalDateTime fechainicio, LocalDate fechaLimiteDevolucion, Usuario usuario, Libro libro) {
        this.fechainicio = fechainicio;
        this.fechaLimiteDevolucion = fechaLimiteDevolucion;
        this.usuario = usuario;
        this.libro = libro;
    }
}
