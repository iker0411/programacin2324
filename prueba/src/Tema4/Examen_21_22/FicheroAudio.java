package Tema4.Examen_21_22;

public class FicheroAudio extends Fichero implements Reproducible{
    private byte[] contenido;
    private int duracion;

    public FicheroAudio(String nombre, byte[] contenido, int duracion) {
        super(nombre);
        this.contenido = contenido;
        this.duracion = duracion;

    }

    @Override
    public long getSize() {
        return contenido.length;
    }

    public int getDuracion() {
        return duracion;
    }

    @Override
    public String reproducir() {
        return "Reproduciendo";
    }
}
