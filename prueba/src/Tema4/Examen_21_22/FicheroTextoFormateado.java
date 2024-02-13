package Tema4.Examen_21_22;

public class FicheroTextoFormateado extends Ficherotexto implements Analizable{
    private String tipoFuente;
    private int tamano;

    private String colorFuente;

    public FicheroTextoFormateado(String nombre, String[] parrafos, String tipoFuente, int tamano, String colorFuente) {
        super(nombre, parrafos);
        this.tipoFuente = tipoFuente;
        this.tamano = tamano;
        this.colorFuente = colorFuente;
    }

    public String getTipoFuente() {
        return tipoFuente;
    }

    public int getTamano() {
        return tamano;
    }

    public String getColorFuente() {
        return colorFuente;
    }

    @Override
    public String analizar() {
        return "Analizando" + getNombre();
    }
}
