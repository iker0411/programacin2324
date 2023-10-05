package Boletin1_2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digame una temperatura");
        double grados1 = sc.nextInt();
        double grados2 = (grados1*9/5) +32;
        System.out.println("La temperatura Celsius es " + grados1 + " y la temperatura en Fahrenheit es " + grados2);

    }
}
