package Tema4.Examen_21_22;

import java.time.LocalDateTime;

public class Fichero {
    private String nombre;
    private long size;
    private LocalDateTime dateCreatime;


    public Fichero(String nombre, long size) {
        this.nombre = nombre;
        setSize(size);
        this.dateCreatime = LocalDateTime.now();
    }

    public long getSize() {
        return size;
    }

    private void setSize(long size)  {
       if (size < 1) throw new IllegalArgumentException("El tamaño del archivo no puede ser negativo");
       this.size = size;
    }
}
