package Tema4.Examen_21_22;


import java.time.LocalDateTime;

public abstract class Fichero {
    private String nombre;
    private LocalDateTime fechaCreacion;

    public Fichero(String nombre) {
        this.nombre = nombre;
        this.fechaCreacion = LocalDateTime.now();
    }

    public abstract long getSize();

    public String getNombre() {
        return nombre;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }
}
