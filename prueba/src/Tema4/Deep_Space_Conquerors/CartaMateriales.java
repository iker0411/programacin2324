package Tema4.Deep_Space_Conquerors;

public class CartaMateriales extends Carta{
    private String material;

    public CartaMateriales(String nombre, int precio, String material) {
        super(nombre, precio);
        this.material = material;
    }
}
