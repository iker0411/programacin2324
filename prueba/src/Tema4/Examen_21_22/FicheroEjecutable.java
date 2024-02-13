package Tema4.Examen_21_22;

public class FicheroEjecutable extends Fichero implements Analizable{
    private byte[] contenido;
    private int permiso;

    public FicheroEjecutable(String nombre, byte[] contenido, int permiso) {
        super(nombre);
        this.contenido = contenido;
        this.permiso = permiso;
    }

    @Override
    public long getSize() {
        return contenido.length;
    }

    public int getPermiso() {
        return permiso;
    }

    @Override
    public String analizar() {
        return "Analizando" + getNombre();
    }
}
