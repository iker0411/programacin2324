package Tema4.Boletin5_2_2;

public class CirculoMovible extends Forma implements Animable, Dibujable{
    private double radio;

    public CirculoMovible(double radio) {
        this.radio = radio;
    }

    @Override
    public void animar() {
        System.out.println("Animando circulo");
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando circulo movible");
    }


    @Override
    public double calcularArea() {
        return 2*Math.PI*radio;
    }
}

