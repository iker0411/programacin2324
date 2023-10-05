package Boletin1_2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mi nombre es");
        String nombre = sc.nextLine();
        System.out.println("Mi edad es");
        int edad = sc.nextInt();
        System.out.println(" MI altura es");
        double altura = sc.nextInt();
        System.out.println("Mi nombre es " + nombre + " tengo " + edad + " años y mido " + altura + " metros");
    }
}
