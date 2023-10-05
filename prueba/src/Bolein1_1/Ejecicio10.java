package Bolein1_1;

import java.util.Scanner;

public class Ejecicio10 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num;
       do{
           System.out.println("Introduce un número entero o cero");
           num = sc.nextInt();
        }while (num < 0);
       int  acc = 1;
       for (int i = num; i >= 1; i--){
           acc = acc * i;
       }
        System.out.println("El factorial de " + num + " es " + acc);
   }
}
