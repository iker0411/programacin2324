package Boletin1_7;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int inverso;

        System.out.println("Dime un número");
        num1= sc.nextInt();

        inverso = reverse(num1);
         if ( inverso==num1){
                System.out.println("El número es capicúa");
         }else {
             System.out.println("El número no es capicúa");
         }
    }
     public static int reverse (int num1){
        int inverso = 0;
        while (num1 !=0){
            inverso = inverso * 10 + num1 % 10;
            num1/=10;
        }
        return inverso;
     }

}
