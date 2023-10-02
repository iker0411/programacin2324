package Bolein1_1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variable
        int num;
        //inicio
        do {
            System.out.println("Introduce un número del 0 al 10");
             num = Integer.parseInt(sc.nextLine());
        } while (num < 0 || num > 10);
        sc.close();
        for (int i = 0; i <= 10; i++){
            //System.out.printf("%2d * %2d = %3d\n", num, i, num * i);
            System.out.println(num + "*" + i + "=" + num * i);
        }
    }
}
