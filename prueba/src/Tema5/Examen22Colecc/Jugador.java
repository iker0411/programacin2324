package Tema5.Examen22Colecc;

public class Jugador extends Cromo {

    private String nombreJugador;
    private String equipo;
    private int altura;

    public Jugador(String id, String nombreJugador, String equipo, int altura) {
        super(id);
        this.nombreJugador = nombreJugador;
        this.equipo = equipo;
        this.altura = altura;
    }

    @Override
    public String getEquipo() {
        return equipo;
    }

    public int getAltura() {
        return altura;
    }
}
