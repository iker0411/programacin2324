package Tema3.Boletin4_4_6;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la palabra:");
        String palabra = sc.nextLine();

        System.out.printf("En la palabra %s hay %d vocales diferentes", palabra, contarvolcalesDiferentes(palabra));
    }

    public static int contarvolcalesDiferentes(String palabra) {
        palabra = palabra.toLowerCase();
        int cont = 0;
        boolean a = false;
        boolean e = false;
        boolean i = false;
        boolean o = false;
        boolean u = false;

        for (int j = 0; j < palabra.length(); j++) {
            switch (palabra.charAt(j)) {
                case 'a':
                    a = true;
                    break;
                case 'e':
                    e = true;
                    break;
                case 'i':
                    i = true;
                    break;
                case 'o':
                    o = true;
                    break;
                case 'u':
                    u = true;
                    break;

            }
            if (a) cont++;
            if (e) cont++;
            if (i) cont++;
            if (o) cont++;
            if (u) cont++;
        }

        return cont;
    }
}
