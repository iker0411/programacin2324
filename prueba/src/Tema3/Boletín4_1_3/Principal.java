package Tema3.Boletín4_1_3;

import Boletin1_1.MientradaSalida;

public class Principal {
    public static void main(String[] args) {
        int opcionEscogida;

        do {
            MostrarMenu();
            opcionEscogida = MientradaSalida.leerEnteroDeRango("Selecciona una opcion", 1,5);
            switch (opcionEscogida){
                case 1:

            }
        }while (opcionEscogida != 5);
    }
    public static void MostrarMenu(){
        System.out.println("Bienvenido a la máquina de café. elija unas de las siguientes opciones:");
        System.out.println("1. Servir café (" + Maquina.PRECIO_CAFE + "euro)");
        System.out.println("2. Servir Leche (" + Maquina.PRECIO_LECHE + "euro)");
        System.out.println("3. Servir café con leche(" + Maquina.PRECIO_CAFE_LEHCE + "euro)");
        System.out.println("4. Consultar estado máquina. Aparecen los datos de los depósitos y del monedero");
        System.out.println("5. Apagar máquina y salir");
    }
}
