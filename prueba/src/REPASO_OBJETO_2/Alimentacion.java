package REPASO_OBJETO_2;

import java.time.LocalDateTime;

public class Alimentacion {
    private LocalDateTime fechaHora;

    public enum TipoAlimentacion {
        PIENSO, PAJA
    }

    private TipoAlimentacion tipo;

    public Alimentacion(TipoAlimentacion tipo) {
        this.fechaHora = LocalDateTime.now();
        this.tipo = tipo;
    }
}
