package Tema4.Boletin5_5_2;

import Tema4.EntradaSalida.Lectora;

import java.util.Scanner;

public class MenuVehiculo {
    private static final int MAX_VEHICULOS = 200;

    private static final Vehiculo[] listaVehiculos = new Vehiculo[MAX_VEHICULOS];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do{
            imprimirMenu();
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                darAltaVehiculo();
                break;
            }
        }while (opcion!=4);
    }
    private  static void imprimirMenu(){
        System.out.println("""
                Escoge una opción:
                1)Alta de Vehículo:
                2)Cálculo de precio de alquier:
                3)Listar todos los vehiculos:
                4)Salir
                """);
    }

    private static void darAltaVehiculo() {
        int seleccionUsuario;
        System.out.println("Estos son los vehiculos disponibles");
        int opcion = 0;
        for (TipoVehiculos t : TipoVehiculos.values()) {
            System.out.println(" " + ++opcion + " . " + String.valueOf(t).toLowerCase());
        }
        seleccionUsuario = Lectora.leerEnteroDeRango("Selección: ", TipoVehiculos.values().length, 1);


    }
}
