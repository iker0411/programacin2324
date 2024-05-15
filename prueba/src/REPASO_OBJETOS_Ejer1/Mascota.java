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
}
