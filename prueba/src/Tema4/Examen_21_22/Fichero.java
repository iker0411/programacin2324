package Tema4.Examen_21_22;

import java.time.LocalDateTime;

public class Fichero {
    private String nombre;
    private long size;
    private LocalDateTime dateCreatime;

    public Fichero(String nombre, long size) {
        this.nombre = nombre;
        this.size = size;
        this.dateCreatime = LocalDateTime.now();
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }
}
