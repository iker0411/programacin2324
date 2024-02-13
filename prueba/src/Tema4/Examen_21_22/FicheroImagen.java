package Tema4.Examen_21_22;

public class FicheroImagen extends Fichero{
    private byte[] contenido;
    private TFormato formato;

    public FicheroImagen(String nombre, byte[] contenido, TFormato formato) {
        super(nombre);
        this.contenido = contenido;
        this.formato = formato;
    }


    @Override
    public long getSize() {
        return contenido.length;
    }
}
