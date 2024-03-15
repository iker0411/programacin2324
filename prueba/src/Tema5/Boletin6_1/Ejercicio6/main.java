package Tema5.Boletin6_1.Ejercicio6;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        GranAlmacen mercadona = new GranAlmacen();

        boolean fin = false;
        while (!fin) {
            try {
                System.out.println(menu());
                System.out.print("\n¿Qué desea hacer?: ");
                int op = Integer.parseInt(sc.nextLine());
                int numCaja;
                switch (op) {
                    case 1:
                        System.out.print("\n¿Qué caja desea abrir?: ");
                        numCaja = Integer.parseInt(sc.nextLine());
                        mercadona.abrirCaja(numCaja);
                        System.out.println("Caja número " + numCaja + " abierta.");
                        break;
                    case 2:
                        System.out.print("\n¿Qué caja desea cerrar?: ");
                        numCaja = Integer.parseInt(sc.nextLine());
                        mercadona.cerrarCaja(numCaja);
                        System.out.println("Caja número " + numCaja + " cerrada.");
                        break;
                    case 3:

                        String mensaje = mercadona.nuevoCliente();
                        System.out.println(mensaje);
                        break;
                    case 4:
                        System.out.print("\n¿Qué caja desea atender?: ");
                        numCaja = Integer.parseInt(sc.nextLine());
                        int numCliente = mercadona.atenderCliente(numCaja);
                        System.out.println("Se ha atendido al cliente número " + numCliente + ".");
                        break;
                    case 5:
                        System.out.println("Que tenga un buen día.");
                        fin = true;
                        break;
                    default:
                        System.err.println("Opción inválida.");
                }
            } catch (AlmacenException e) {
                System.err.println("\n" + e.getMessage());
            }
        }

        sc.close();
    }

    private static String menu() {
        return "\n(1) Abrir caja" + "\n(2) Cerrar caja" + "\n(3) Nuevo cliente" + "\n(4) Atender cliente"
                + "\n(5) Salir";
    }
}
