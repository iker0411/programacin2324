package Tema4.Boletin5_2_2;

public class Circulo extends Forma implements Dibujable{

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void dibujar() {
        System.out.println("dinujamdo circulo");
    }

    @Override
    public double calcularArea() {
        return 2*Math.PI*radio;
    }
}
