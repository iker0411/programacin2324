package REPASO_OBJETOS_Ejer1;

public class Cliente {
    private String nombre;
    private static int contCliente = 1;
    private int id;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.id = contCliente++;
    }

}
