package Tema4.Boletin5_5_2;

public abstract class Vehiculo {
    private String matricula;
    private Gama gama;

    private double alquiler;
    public Vehiculo (String matricula, Gama gama){
        this.matricula = matricula;
        this.gama = gama;
        setAlquiler();
    }
    public void setAlquiler(){

    }
    public abstract double getPrecioDiario();

    public double getPrecioAlquier(int dias){
        return getPrecioDiario() * dias;
    }



    public String getMatricula() {
        return matricula;
    }

    public Gama getGama() {
        return gama;
    }
}
