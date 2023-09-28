package Boletin1_2;

import java.util.Scanner;

public class buclewhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un número");
        int num = teclado.nextInt();
        int i = 2;
        while (num % i != 0) {

            i++;
        }
        if (num == i) {
            System.out.println(i + " es un número primo.");
        } else {
            System.out.println("El primer dividor: " + i);
        }
        teclado.close();
    }

}
