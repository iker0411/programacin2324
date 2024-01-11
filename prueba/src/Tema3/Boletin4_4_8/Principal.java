package Tema3.Boletin4_4_8;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase:");
        String cadena = sc.nextLine();
        System.out.println(cuentaPalabras(cadena));
    }
    public static int cuentaPalabras(String cadena){
        return cadena.isBlank() ? 0 :cadena.trim().split("\\s+").length;

    }
}
