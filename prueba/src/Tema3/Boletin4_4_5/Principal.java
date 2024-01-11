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
            StringBuilder str = new StringBuilder(frase);

            for (int i = 0; i != -1; i += reeemplazador.length()){
                i = str.indexOf(reemplazado, i);

                if (i != -1){
                    str.delete(i, i +reemplazado.length());
                    str.insert(i, reeemplazador);
                }else {
                    break;
                }
            }
        return  String.valueOf(str);
    }
}
