package Boletinextra;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();
        for (int i = 2; i < num1; i++){
            if (num1 % i==0 && num2 % i == 0) {
                System.out.println("Son pimos entre si");
                break;
            } else {
                System.out.println("No son primos");
            }
        }
        sc.close();
    }
}
