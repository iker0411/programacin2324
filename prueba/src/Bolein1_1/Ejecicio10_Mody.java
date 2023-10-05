package Bolein1_1;

import java.util.Scanner;

public class Ejecicio10_Mody {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pepe = 5;
        System.out.println(factorial(pepe));



    }
    public static int factorial (int a ){
        if (a == 0 || a == 1){
            return 1;
        }
        return a * factorial(a - 1);
    }
}
