package REPASO_OBJETOS_Ejer1;

import com.sun.jdi.ClassNotLoadedException;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private String nombre;
    private List<Mascota> listaMascota;
    private List<Cliente> listaCliente;
    private List<Compra> listaCompras;
    private Boolean disponible;

    public Tienda(String nombre){
        this.nombre = nombre;
        this.listaMascota = new ArrayList<>();
        this.listaCliente = new ArrayList<>();
        this.listaCompras = new ArrayList<>();
    }

    public List<Cliente> getListaCliente() {
        return listaCliente;
    }

    public void anadirClientes(String nombre){
        Cliente cliente = new Cliente(nombre);
        listaCliente.add(cliente);
    }
    public void annadirmascota(String nombre, Especie especie, int edad, double precio, boolean disponible){

        Mascota mascota = new Mascota(nombre,especie,edad,precio, disponible);
        listaMascota.add(mascota);
    }

    public void comprarMascota(Cliente cliente, Mascota mascota){
        Compra compra = new Compra(cliente, mascota);
        listaCompras.add(compra);
    }
}
