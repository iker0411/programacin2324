package Tema4.Examen_21_22;

public class FicheroBinario extends Fichero{

    private byte[] contenido;
    public FicheroBinario(String nombre, long size, byte[] contenido) {
        super(nombre, size);
        setContenido(contenido);
    }
    private void setContenido(byte[] contenido){
        this.contenido = contenido;
    }

}
