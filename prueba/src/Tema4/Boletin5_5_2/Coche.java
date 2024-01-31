package Tema4.Boletin5_5_2;

public class Coche extends Vehiculo {

    private Combustible combustible;

    public Coche(String matricula, Gama gama, Combustible combustible) {
        super(matricula, gama);
        this.combustible = combustible;
    }

    public Combustible getCombustible() {
        return combustible;
    }

    @Override
    public double getPrecioDiario() {
        return getGama().getPrecioBaseDia() + combustible.getPrecioCombustibleDia();
    }
}
