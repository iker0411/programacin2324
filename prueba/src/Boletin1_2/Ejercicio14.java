package Boletin1_2;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digame un número");
        /*
         Siempre cuando pongamos una variable (num) ponemos
        nexInt y para que no pase a la siguiente variable sin leer lo que ponemos
         (num), ponemos nextLine.
         */
        int num1 = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Digame un segundo número");
        int num2 = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Que tipo de operacion vas a utilizar(Suma, Resta, Multiplicación, División)");
        String oper = teclado.nextLine();
        switch (oper) {
            case "Suma":
            case "+":
                System.out.println("El resultado de la suma es " + (num1 + num2));
                break;
            case "Resta":
            case "-":
                System.out.println("El resultado de la resta es " + (num1 - num2));
                break;
            case "Multiplicación":
            case "*":
                System.out.println("El resultado de la Multiplicación es " + (num1 * num2));
                break;
            case "División":
            case "/":
                System.out.println("El resultado de la División es " + (num1 / num2));
                break;
            default:
                System.out.println("No conozco esta operación");
        }
    }
}
