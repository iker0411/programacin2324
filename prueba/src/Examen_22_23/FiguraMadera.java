package Examen_22_23;

public class FiguraMadera extends JugueteMadera implements Apilable {
    private String Color;
    private int numlado;

    public FiguraMadera(String nombre, String nombreMarca ,String paisOrigen, int fechaTala, String color, int numLados, double precio) throws JugueteException {
        super(nombreMarca, nombre, precio, paisOrigen, fechaTala);
        Color = color;
        setNumlado(numlado);
    }

    public void setNumlado(int numlado) throws JugueteException {
        if (numlado < 2){
            throw new JugueteException("El numero de lados es demasiado bajo");
        }
        this.numlado = numlado;
    }

    @Override
    public void apilar(Juguete juguete) throws JugueteException {
        Apilable.super.apilar(juguete);
        System.out.println("Se ha apilado el juguete " + juguete.getNombre() + "sobre el juguete" + this.getNombre());
    }
}
