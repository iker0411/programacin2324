package Tema3.EjercicioAvion;


import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Revision {
    private LocalDateTime fecha;

    private boolean estado;

    //Se mide en meses
    private int periodoValidez;

    public Revision(LocalDateTime fecha, boolean estado, int periodoValidez) {
        if (fecha.isBefore(LocalDateTime.now())) {
            this.fecha = fecha;
        }
        this.estado = estado;
        if (periodoValidez > 0) {
            this.periodoValidez = periodoValidez;
        }
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public boolean isEstado() {
        return estado;
    }

    public int getPeriodoValidez() {
        return periodoValidez;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return fecha.format(formatter) + " con resultado " + (estado ? "satisfactorio con una validez de " + periodoValidez + " meses" : "no satisfactorio ");
    }
}
