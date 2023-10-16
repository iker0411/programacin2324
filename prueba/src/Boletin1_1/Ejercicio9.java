package Boletin1_1;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número positivo");
        int num = sc.nextInt();
        int suma = 0;
        for (int i = 1; i < num; i++){
            if (num % i == 0){
                suma += i;
            }
        }
            if (suma == num){
                System.out.println("El número es perfecto");
            } else {
                System.out.println("El número no es perfecto5");
            }

    }
}
