package Boletin1_2;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un nivel");
        int nivel = sc.nextInt();
        System.out.println("Dime las misiones completadas");
        int misisones = sc.nextInt();
        if (nivel > 10 && misisones > 20) {
            System.out.println("Tienes acceso a la misión especial");
        } else {
            System.out.println("No cumples los requisitos para la misión especial");
        }


    }
}
