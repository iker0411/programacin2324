package Examen_22_23;

public class InstrumentoMusical extends JugueteMadera {
    private int edadMin;
    public static final int EDAD_MINIMA_PERMITIDA = 1;
    public InstrumentoMusical(String nombre, String nombreMarca,  String paisOrigen, int fechaTala, int edadMin, double precio) throws JugueteException {
        super(nombreMarca, nombre, precio, paisOrigen, fechaTala);
        setEdadMin(edadMin);
    }

    public int getEdadMin() {
        return edadMin;
    }

    public void setEdadMin(int edadMin) throws JugueteException {
        if (edadMin < EDAD_MINIMA_PERMITIDA){
            throw new JugueteException("Valor incorrecto");
        }
        this.edadMin = edadMin;
    }
}
