package Tema3.Boletin4_1_2;

public class cuenta {
    private int numReintegro;
    private int numIngresos;
    private double saldo;

    public cuenta(double saldoInicial) {
        setSaldo(saldoInicial);
        this.numIngresos = 0;
        this.saldo = 0;
    }

    public void setSaldo(double saldoInicial) {
        if (saldoInicial >= 0) {
            saldo = saldoInicial;
        } else {
            System.out.println("El saldo inicial es ");
        }

    }

    public int getNumIngresos() {
        return numIngresos;
    }

    public void HacerNumIngresos(double CantidadIngresar) {

        if (CantidadIngresar > 0) {
            saldo += CantidadIngresar;
            numIngresos++;
        } else {
            System.out.println("No se puede ingresar el dinero");
        }
    }
}
