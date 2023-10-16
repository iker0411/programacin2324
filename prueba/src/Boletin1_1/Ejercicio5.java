package Boletin1_1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nun;
        int cant = -1;
        do {
            System.out.println("Introduce un número negativo");
            nun = sc.nextInt();
            sc.nextLine();
            cant ++;
        }while (nun >= 0);
        System.out.println("Has introducido" + " " + cant + " " + "números positivos" );
    }
}
