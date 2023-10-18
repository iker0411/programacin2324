package Boletin1_6;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número");
        int num = sc.nextInt();

        int numB = Math.abs(num);
        int i;

        for (i = 1; numB >= 10; i++){
            numB /= 10;
        }
        System.out.printf("El número %d tiene %d cifras", num, i);
    }
}
