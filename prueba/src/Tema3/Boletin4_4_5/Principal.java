package Tema3.Boletin4_4_5;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un texto original:");
        String sentence = sc.nextLine();
        System.out.println("Introduce a buscar:");
        String word1 = sc.nextLine();
        System.out.println("Introduce a reemplazar:");
        String word2 = sc.nextLine();

        System.out.println("\n" + reeemplazarExpresion(sentence, word1, word2));
    }
    public static String reeemplazarExpresion(String frase, String reemplazado, String reeemplazador){
        for(int i = frase.indexOf(reemplazado); i != -1; i += reeemplazador.length()){ //Todo: Revisar última letra error.
            
        }
    }
}
