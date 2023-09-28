package Boletín1_2;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu comida favorita");
        String comida = sc.nextLine();
        switch (comida) {
            case "Hamburguesa":
                System.out.println("Hola");
                break;
            case "Tacos":
                System.out.println("NO");
                break;
            case "Ensalada":
                System.out.println("Sí");
                break;
            default:
                System.out.println("No funciona");
        }
    }
}
