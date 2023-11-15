package Boletin1_1;

import java.util.Scanner;

public class MientradaSalida {
    public static Scanner sc = new Scanner(System.in);

    /**
     * Lee un entero comprendido entre el minimo y el máximo (incluidos)
     *
     * @param min Valor minimo aceptado
     * @param max Valor máximo aceptado
     * @return numero leido
     */
    public static int leerEnteroDeRango(String mensaje, int min, int max) {
        if (min >= max) {
            // TODO: Hacer cuando conozcas las excepxiones
        }

        System.out.printf(mensaje + ": ");
        int numeroLeido;
        do {
            numeroLeido = Integer.parseInt(sc.nextLine());
            if (numeroLeido < min || numeroLeido > max) {
                System.out.println("Por favor, introduce un valor entre %d y ");
            }

        } while (numeroLeido < min || numeroLeido > max);

        return numeroLeido;
    }

    public static int leerEntero(String mensaje) {

        System.out.printf(mensaje + ": ");
        int num = Integer.parseInt(sc.nextLine());
        //TODO controlar excepcion

        return num;
    }

    public static int leerEnteroPositivo(String mensaje) {
        int numPo;
        do {
            System.out.printf(mensaje + ": ");
            numPo = Integer.parseInt(sc.nextLine());
            if (numPo < 0) {
                System.out.println("Debe ser un número positivo");
            }

        } while (numPo < 0);
        return numPo;
    }
    public static char SiONo (String mensaje){
        //TODO: Controlar excepciones
        System.out.printf(mensaje + ": ");
        char sn;
        do {
            sn = sc.nextLine().toUpperCase().charAt(0);
        }while (sn != 's' && sn != 'S' && sn != 'n' && sn != 'N' );
        return sn;

    }

}
