package Boletin1_6;

import Boletin1_1.MientradaSalida;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, result;

        a = MientradaSalida.leerEntero("Introduce valor de a");
        b = MientradaSalida.leerEntero("Introduce el valor de b");
        c = MientradaSalida.leerEntero("Introduce el valor de c");

        result = (b * b) - 4 * a * c;

        if (a== 0){
            System.out.println("La ecuación es de primer grado asi que se soluconara de otra forma");

        }else {
            if (result == 0){
                System.out.println("La ecuación tiene solamente una solución");
            } else if (result > 0) {
                System.out.println("La ecuación tiene dos solución");
            } else {
                System.out.println("La ecuación no tiene solución");
            }
        }

    }

}

