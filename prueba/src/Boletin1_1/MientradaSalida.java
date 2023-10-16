package Boletin1_1;

import java.util.Scanner;

public class MientradaSalida {
    public static Scanner sc = new Scanner(System.in);


    /**
     * lee un entero comprendido entre el mínimo y el máximo (incluidos)
     * @param min valor mínimo aceptado
     * @param max valor máximo aceptado
     * @return El número leido
     */
    public static  int positi(String mensaje, int po, int ent){
        System.out.println(mensaje + ": ");
        int numLeido;
        do{
            numLeido = Integer.parseInt(sc.nextLine());
            if (numLeido<0);
               System.out.println("Introduce un nuevo número positivo");
        }while (numLeido<0);
        return numLeido;

    }
   /* public static char LeerSN(String mensaje){
        //todo:Controlas excepciones
        System.out.println(mensaje + ": ");
        char sn;
        do {
         sn = sc.nextLine().charAt(0);
        }while (sn);
    }*/
    public static  int leerEnteroDeRango(String mensaje, int min, int max) {
        System.out.printf(mensaje + ": ");
        if (min >= max) {
            //TODO:Hacer cuando conozccamos las excepciones

        }
        System.out.println(mensaje + ": ");
        int numeroleido;
        do {
             numeroleido = Integer.parseInt(sc.nextLine());
             if (numeroleido < min || numeroleido > max){
                 System.out.printf("Por favor, introduce un valor entre %d y %d:", min, max);
             }
        }while (numeroleido < min || numeroleido > max);
        return numeroleido;

    }
    public static void cerrarScanner(){

    }
}
