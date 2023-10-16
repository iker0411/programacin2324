package Boletin1_6;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int b, exp, res= 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce en la base y el exponente");
        b = sc.nextInt();
        exp = sc.nextInt();

        if (b == 0) {
            if (exp != 0){
                res = 0;
            }
        }else {
            for (int i = 1; i <= exp; i++){
                res *= b;
            }
        }
        System.out.println("El resultado es " + res);
        sc.close();
    }
}
