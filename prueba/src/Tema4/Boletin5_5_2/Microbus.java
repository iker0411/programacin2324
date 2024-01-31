package Tema4.Boletin5_5_2;

public class Microbus extends Vehiculo {

    public static final double PRECIO_PLAZA = 5;
    private int numPlazas;

    public Microbus(String matricula, Gama gama, int numPlazas) {
        super(matricula, gama);
        this.numPlazas = numPlazas;
    }

   private void setNumPlazas(int numPlazas)throws VehiculoException{
      if (numPlazas < 1){
          throw new VehiculoException("Numero de plaza incorrecto");
      }
      this.numPlazas = numPlazas;
   }
   public double getPrecioPlaza(){
        return getGama().getPrecioBaseDia() + numPlazas * PRECIO_PLAZA;
   }

    @Override
    public double getPrecioDiario() {
        return getGama().getPrecioBaseDia() * (numPlazas*PRECIO_PLAZA);
    }
}
