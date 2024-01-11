package Tema3.Boletin4_4_6;

import java.util.Arrays;
import java.util.Scanner;

public class Principal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la palabra:");
        String palabra = sc.nextLine();

        System.out.printf("En la palabra %s hay %d vocales diferentes", palabra, contarvolcalesDiferentes2(palabra));
    }

    public static int contarvolcalesDiferentes2(String palabra){
        palabra = palabra.toLowerCase();
        int conta = 0;
        char[] vocales = {'a', 'e', 'i','o','u'};
        for (char v : vocales){
            if (palabra.contains(v+"")) conta++;
        }
        return conta;
    }
}
