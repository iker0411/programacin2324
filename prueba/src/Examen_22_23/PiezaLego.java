package Examen_22_23;

public class PiezaLego extends JuguetePlastico implements Apilable{
    private int longitud;
    private String color;

    public PiezaLego(String nombre, String nombreMarca,  int longitud, String color, double precio) throws JugueteException {
        super(nombreMarca, nombre, precio, TPlastico.ABS);
        setLongitud(longitud);
        this.color = color;
    }

    public int getLongitud() {
        return longitud;
    }

    public String getColor() {
        return color;
    }

    public void setLongitud(int longitud) throws JugueteException {
        if (longitud < 1){
            throw new JugueteException("Valor incorrecto");
        }
        this.longitud = longitud;
    }

    @Override
    public void apilar(Juguete juguete) throws JugueteException {
        Apilable.super.apilar(juguete);
        System.out.println("Se ha apilado el juguete " + juguete.getNombre() + " sobre el juguete " + this.getNombre());
    }
}
