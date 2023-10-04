package Bolein1_1;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Introduce  cantidad de números");
            num = sc.nextInt();
        }
        while (num <= 0);
        int suma = 0;
        for (int i= 1; i <= num; i++){
            System.out.println("Introduce el siguiente número");
            int num2 = sc.nextInt();
            suma+=num2;
        }
        System.out.println("El resultado es " + (double)suma/num);
    }
}
