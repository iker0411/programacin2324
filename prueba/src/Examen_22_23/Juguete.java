package Examen_22_23;

public abstract class Juguete {
    private String nombremarca;
    private String nombre;
    private double precio;

    public Juguete(String nombremarca, String nombre, double precio)throws JugueteException {
        this.nombremarca = nombremarca;
        this.nombre = nombre;
        setPrecio(precio);
    }

    public String getNombremarca() {
        return nombremarca;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio)throws JugueteException{
        if (precio < 1){
            throw new JugueteException("El precio debe ser positivo");
        }
        this.precio = precio;
    }
}
