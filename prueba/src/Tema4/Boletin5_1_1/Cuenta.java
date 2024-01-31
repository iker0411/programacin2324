package Tema4.Boletin5_1_1;

public class Cuenta {
    public static final double SALDO_DEFAULT = 0;
    private double saldo;

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }
    public Cuenta(){
        this.saldo= SALDO_DEFAULT;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ingresarDinero(double dineroAIngresar) throws CuentaExeption{
        if(dineroAIngresar <= 0){
            throw new CuentaExeption("Debes ingresar una cantidad positiva");        }
        this.saldo += dineroAIngresar;
    }
    public void SacarDinero(double dineroSacar)throws CuentaExeption{
        if (dineroSacar <= 0){
            throw new CuentaExeption("Debes sacar dinero positivo");
        }
        if (dineroSacar > saldo){
            throw new CuentaExeption("No puedes sacar más del saldo disponible(" + saldo +"€)");
        }
        saldo +=dineroSacar;
    }
}
