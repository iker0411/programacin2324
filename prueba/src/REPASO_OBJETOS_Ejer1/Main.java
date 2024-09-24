package REPASO_OBJETOS_Ejer1;

import Tema4.EntradaSalida.Lectora;
import Tema5.Practica_No_Evaluable_Recetas_de_Cocina.MIEntradaSalida2_0;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static  Tienda tienda = new Tienda("AnimalCrossingShops");
    public static void main(String[] args) {
        addMascota();
        addMascota();
        addCliente();
        addCompra();
        devolucionMascota();
    }
    public static void addCliente (){
        tienda.anadirClientes(MIEntradaSalida2_0.leerCadena("Introduce el nombre del cliente"));

    }



    public static void addMascota (){
        String nombre = MIEntradaSalida2_0.leerCadena("Introduce el nombre de la mascota");
        int edad = MIEntradaSalida2_0.leerEnteroPositivo("Introduce la edad de la mascota");
        double precio = MIEntradaSalida2_0.leerDoublePositivo("Introduce el precio de la mascota");
        Especie especie = MIEntradaSalida2_0.leerEnum("Que tipo de mascota es: ", Especie.values());
        boolean disponible = MIEntradaSalida2_0.leerSN("¿Está disponible para la venta?")=='S';
        tienda.annadirmascota(nombre,especie,edad,precio, disponible);
    }

    public static void addCompra (){
        List<Cliente> clientes = tienda.getListaCliente();
        List<Mascota> mascotas = tienda.getListaMascotaDisponible();
        Cliente c = MIEntradaSalida2_0.leerEnum("Selecciona el cliente", clientes.toArray(Cliente[]::new));
        Mascota m = MIEntradaSalida2_0.leerEnum("Selecciona la mascota", mascotas.toArray(Mascota[]::new));
        tienda.comprarMascota(c, m);
    }

    public static void devolucionMascota(){
        List<Cliente> clientes = tienda.getListaCliente();
        Cliente c = MIEntradaSalida2_0.leerEnum("Selecciona el cliente", clientes.toArray(Cliente[]::new));
        List<Compra> compras = tienda.listarComprasCliente(c);
        Compra compra = MIEntradaSalida2_0.leerEnum("Selecciona la compra ", compras.toArray(Compra[]::new));

    }


}

