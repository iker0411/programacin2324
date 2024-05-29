package REPASO_OBJETO_2;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Transaccion {
    private Producto producto;
    private int numeroUnidades;
    private double precio;
    private LocalDateTime fecha;

    public Transaccion(Producto producto, int numeroUnidades) {
        this.fecha = LocalDateTime.now();
        this.numeroUnidades = numeroUnidades;
        this.producto = producto;
        this.precio = producto.getPrecio();
    }

    public double getTotal() {
        return numeroUnidades * precio;
    }


}
