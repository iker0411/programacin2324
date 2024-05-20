package REPASO_OBJETOS_Ejer1;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class Compra {
    private int id;
    private Cliente cliente;
    private Mascota mascota;
    private LocalDateTime fechaHora;
    private LocalDateTime fechaDevolucion;
    private static int contCompra = 1;

    public Compra( Cliente cliente, Mascota mascota){
        this.id = contCompra++;
        this.cliente = cliente;
        this.mascota = mascota;
        this.fechaHora = LocalDateTime.now();
    }

    public LocalDateTime getFechaDevolucion() {
        return fechaDevolucion;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getId() {
        return id;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public static int getContCompra() {
        return contCompra;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Compra{");
        sb.append("id=").append(id);
        sb.append(", cliente=").append(cliente);
        sb.append(", mascota=").append(mascota);
        sb.append(", fechaHora=").append(fechaHora);
        sb.append(", fechaDevolucion=").append(fechaDevolucion);
        sb.append('}');
        return sb.toString();
    }
    public void marcarDevolucion(){
        this.fechaDevolucion = LocalDateTime.now();
    }
}
