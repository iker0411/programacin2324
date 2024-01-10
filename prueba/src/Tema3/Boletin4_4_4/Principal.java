package Tema3.Boletin4_4_4;


import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase");
        String cadena = sc.nextLine();
        System.out.println("Introduce la palabra escondida:");
        String palabraEscondida = sc.nextLine();
        if (encuentraPalabras(cadena,palabraEscondida)){
            System.out.println("Encontrada");
        }else {
            System.out.println("No encontrada");
        }
    }
    public static boolean encuentraPalabras(String cadena, String palabraEscondida ){
        int contPalaEncon = 0;
        cadena = cadena.toLowerCase();
        palabraEscondida = palabraEscondida.toLowerCase();
        for (int i = 0; i < cadena.length(); i++){
            if (cadena.charAt(i) == palabraEscondida.charAt(contPalaEncon)){
                contPalaEncon++;

            }
            if (contPalaEncon == palabraEscondida.length()){
                break;
            }
        }
        return contPalaEncon == palabraEscondida.length();
    }
}
