package Tema3;

import java.sql.SQLOutput;

public class frase {
    public static void main(String[] args) {
        String indexof = ("Voy a ver a mi abuela ");
        //falta por hace
        System.out.println(indexof);
        System.out.println("¿Cuantas palabras de la frases empieza por a?");
        int pos = indexof.indexOf("a");
        System.out.println(pos);
        String casa = indexof.substring(15, 21);
        String casa2 = indexof.substring(15);
        System.out.println(casa);
        System.out.println(casa2);

    }
}
