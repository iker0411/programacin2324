package Tema3.EjercicioAvion;

public class Deposito {
    private double capacida_Maxima;
    private double cantidad_actual;


    public Deposito(double capacida_Maxima, double cantidad_actual) {
        this.capacida_Maxima = capacida_Maxima;
        setCantidad_actual(cantidad_actual);
    }

    public void setCantidad_actual(double cantidad_actual) {
        if (cantidad_actual < capacida_Maxima && cantidad_actual > 0) {
            this.cantidad_actual = cantidad_actual;
        }
    }

    public double getCapacida_Maxima() {
        return capacida_Maxima;
    }

    public double getCantidad_actual() {
        return cantidad_actual;
    }

    @Override
    public String toString() {
        return cantidad_actual / capacida_Maxima * 100 + "% de un deposito de " + cantidad_actual + " litros. ";
    }
}
