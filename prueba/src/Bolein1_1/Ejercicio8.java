package Bolein1_1;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1;
        double menor = Double.MAX_VALUE;

        do{
            System.out.println("Introduce un número");
            num1 = sc.nextDouble();
            if (num1 < menor){
                menor = num1;
            }
            System.out.println("Quieres introducir más número (s/n)");
            String respuesta = sc.next();
            if (!respuesta.equalsIgnoreCase("S") ){
                break;
            }
        }while (true);
        if (menor == Double.MAX_VALUE){
            System.out.println("No has introducido ningun número");

        }else {
            System.out.println("El número menoe es  " + menor);
        }
    }
}
