package Boletinextra;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class Ejercicio1_modyfi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número");
        int num1 = sc.nextInt();
        System.out.println("Dime otro número");
        int num2 = sc.nextInt();

        boolean primoEntreSi = true;
        for (int i = 2; i < num1 && i < num2 && primoEntreSi; i++){
            if (num1 % i == 0 && num2 % i == 0){
                System.out.println("No son primos entre si porque el " + i + " divide a " + num1 + " y " + num2);
                primoEntreSi = false;
            }
        }
        if (primoEntreSi){
            System.out.println("Los números " + num1 + " y " + num2 + "son primos.");
        }
}   }
