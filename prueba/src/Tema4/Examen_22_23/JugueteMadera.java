package Tema4.Examen_22_23;

public class JugueteMadera extends Juguete{
    private String paisOrigen;
    private int fechaTala;

    public JugueteMadera(String nombremarca, String nombre, double precio, String paisOrigen, int fechaTala) throws JugueteException {
        super(nombremarca, nombre, precio);
        this.paisOrigen = paisOrigen;
        this.fechaTala = fechaTala;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public int getFechaTala() {
        return fechaTala;
    }

    public void setFechaTala(int fechaTala) throws JugueteException {
        if (fechaTala < 1 ){
            throw new JugueteException("Año incorrecto");
        }
        this.fechaTala = fechaTala;
    }
}
