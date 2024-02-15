package Examen_22_23;

public class JuguetePlastico extends Juguete{
   private TPlastico Tipoplastico;

    public JuguetePlastico(String nombremarca, String nombre, double precio, TPlastico tiposplastico) throws JugueteException {
        super(nombremarca, nombre, precio);
        this.Tipoplastico = tiposplastico;
    }

    public TPlastico getTipoplastico() {
        return Tipoplastico;
    }
}
