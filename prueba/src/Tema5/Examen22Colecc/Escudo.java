package Tema5.Examen22Colecc;

public class Escudo extends Cromo{
    private String nombre;
    private int annoFuncdacion;
    private int numjugadores;

    public Escudo(String id) {
        super(id);
    }

    @Override
    public String getEquipo() {
        return nombre;
    }

    public Escudo(String id, String nombre, int annoFuncdacion, int numjugadores) {
        super(id);
        this.nombre = nombre;
        this.annoFuncdacion = annoFuncdacion;
        this.numjugadores = numjugadores;
    }

}
