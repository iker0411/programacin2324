package Tema3.Boletin4_4_9;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase:");
        String cadena = sc.nextLine();
        System.out.println(contarCaracteres(cadena));
    }
    public static int contarCaracteres(String cadena){
        int almacenarNumerosEnteros = 0;
        int cont = 0;
        for (int i = 0; i < cadena.length(); i++){
            if (Character.isDigit(cadena.charAt(i))){
                almacenarNumerosEnteros = almacenarNumerosEnteros *10 + Integer.parseInt(cadena.charAt(i) + "");

            }else{
                if (almacenarNumerosEnteros > 0){
                    cont += almacenarNumerosEnteros;
                    almacenarNumerosEnteros = 0;
                }
            }

        }
        return cont +almacenarNumerosEnteros;
    }
}
