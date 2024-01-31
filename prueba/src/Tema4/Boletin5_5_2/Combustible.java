package Tema4.Boletin5_5_2;

import java.util.PropertyResourceBundle;

public enum Combustible {
    GASOLINA(3.5), DIESEL(2);

    private double precioCombustibleDia;

    Combustible(double precioCombustibleDia) {
        this.precioCombustibleDia = precioCombustibleDia;
    }

    public double getPrecioCombustibleDia() {
        return precioCombustibleDia;
    }
}
