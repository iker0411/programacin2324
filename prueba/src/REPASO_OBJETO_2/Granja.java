package REPASO_OBJETO_2;

import java.util.ArrayList;
import java.util.List;

public class Granja {
    private String nombreGranja;
    private List<Animal> animales;
    private List<Producto> productos;
    private List<Transaccion> transacciones;

    public Granja(String nombreGranja) {
        this.nombreGranja = nombreGranja;
        this.animales = new ArrayList<>();
        this.productos = new ArrayList<>();
        this.transacciones = new ArrayList<>();
    }

    public String getNombreGranja() {
        return nombreGranja;
    }

    public List<Animal> getAnimales() {
        return animales;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public List<Producto> getProductosDisponibles() {
        return productos.stream().filter(Producto::isDisponible).toList();
    }

    public void anadirAnimal(Tanimales tipoAnimales, int edad) throws AnimalException {
        Animal animal = new Animal(tipoAnimales, edad);
        animales.add(animal);
    }
}
