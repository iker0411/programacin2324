package REPASO_OBJETOS_Ejer1;

public class Mascota {
    private String tipoMascota;
    private String nombre;
    private Especie especie;
    private int edad;
    private double precio;
    private Boolean disponible;

    public Mascota( String nombre, Especie especie, int edad, double precio, boolean disponible) {
        this.disponible = disponible;
        this.precio = precio;
        this.edad = edad;
        this.nombre = nombre;
        this.especie = especie;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    public String getTipoMascota() {
        return tipoMascota;
    }

    public int getEdad() {
        return edad;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public double getPrecio() {
        return precio;
    }

    public Especie getEspecie() {
        return especie;
    }

    public String getNombre() {
        return nombre;
    }
}
