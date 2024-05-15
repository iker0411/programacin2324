package REPASO_OBJETOS_Ejer1;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class Compra {
    private int id;
    private Cliente cliente;
    private Mascota mascota;
    private LocalDateTime fechaHora;
    private static int contCompra = 1;

    public Compra( Cliente cliente, Mascota mascota){
        this.id = contCompra++;
        this.cliente = cliente;
        this.mascota = mascota;
        this.fechaHora = LocalDateTime.now();
    }



}
