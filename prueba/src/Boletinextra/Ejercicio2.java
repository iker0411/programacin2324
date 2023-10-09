package Boletinextra;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número");
        int num1 = sc.nextInt();

        int f1 = 0;
        int f2 = 1;
        int f3;
        for (int i = 0; i < num1; i++){
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        System.out.println("La succesion de fibonacci de " + num1 + " es " + f1);
    }
}
