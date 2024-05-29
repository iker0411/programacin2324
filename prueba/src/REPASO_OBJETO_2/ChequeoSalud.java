package REPASO_OBJETO_2;

import java.time.LocalDateTime;

public class ChequeoSalud {
    private LocalDateTime fechaHora;

    public enum EstadoSalud {
        ENFERMO, SALUDABLE
    }

    private EstadoSalud salud;

    public ChequeoSalud(EstadoSalud salud) {
        this.fechaHora = LocalDateTime.now();
        this.salud = salud;
    }
}
