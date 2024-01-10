package Tema3.Boletin4_1_3;

import Boletin1_1.MientradaSalida;

public class Principal {
    public static void main(String[] args) {
        int opcionEscogida;
        Maquina maq = new Maquina();

        do {
            MostrarMenu();
            opcionEscogida = MientradaSalida.leerEnteroDeRango("Selecciona una opcion", 1, 5);
            switch (opcionEscogida) {
                case 1:
                    if (maq.puedoServirCafe()) {
                        double pago = MientradaSalida.leerDouble("Introduce el pago:");
                        try {
                            System.out.println(maq.darCambio(pago, Maquina.PRECIO_CAFE));
                            maq.servirCafe();
                        } catch (MaquinaException e) {
                            System.out.println(e.getMessage());
                        }
                    } else {
                        System.out.println("Producto agotado");
                    }
                    break;
                case 2:
                    if (maq.puedoServirLeche()) {
                        double pago = MientradaSalida.leerDouble("Introduce el pago:");
                        try {
                            System.out.println(maq.darCambio(pago, Maquina.PRECIO_LECHE));
                            maq.servirLeche();
                        } catch (MaquinaException e) {
                            System.out.println(e.getMessage());
                        }
                    } else {
                        System.out.println("Producto agotado");
                    }
                    break;
                case 3:
                    if (maq.puedoServirCafeLeche()) {
                        double pago = MientradaSalida.leerDouble("Introduce el pago:");
                        try {
                            System.out.println(maq.darCambio(pago, Maquina.PRECIO_CAFE_LECHE));
                            maq.puedoServirCafeLeche();
                        } catch (MaquinaException e) {
                            System.out.println(e.getMessage());
                        }
                    }else {
                        System.out.println("Producto agotado");
                    }
                    break;
                case 4:
                    System.out.println(maq);
                    break;
                case 5:
                    System.out.println("Gracias por su compra, vuelve a visitarnos");
                    break;
                default:
                    System.out.println("Tienes que elegir una opción desde el 1 al 5");

            }
        } while (opcionEscogida != 5);
    }

    public static void MostrarMenu() {
        System.out.println("Bienvenido a la máquina de café. elija unas de las siguientes opciones:");
        System.out.println("1. Servir café (" + Maquina.PRECIO_CAFE + " euro)");
        System.out.println("2. Servir Leche (" + Maquina.PRECIO_LECHE + " euro)");
        System.out.println("3. Servir café con leche(" + Maquina.PRECIO_CAFE_LECHE + " euro)");
        System.out.println("4. Consultar estado máquina. Aparecen los datos de los depósitos y del monedero");
        System.out.println("5. Apagar máquina y salir");
    }
}
