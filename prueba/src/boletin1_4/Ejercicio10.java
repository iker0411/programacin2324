package boletin1_4;


import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un caracter");
        String caracter = sc.nextLine();
        System.out.println("Dime dos número enteros");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        switch (caracter) {
            case "+":
                System.out.println("El resultado es: " + (num1 + num2));
                break;
            case "-":
                System.out.println("El resultado es: " + (num1 - num2));
                break;
            case "*":
                System.out.println("El resultado es: " + (num1 * num2));
                break;
            case "/":
                if (num2 != 0){
                    System.out.println("El resultado es: " + ((double) num1 / num2));
                }else {
                    System.out.println("No se puede dividir entre 0");
                }
                break;
            default:
                System.out.println("Error al introducir el caracter");
        }
        sc.close();
    }
}
