package Tema3.Boletin4_4_1;

public class Caracte {
    public static void main(String[] args) {
        String caracteres = "Hola mundo";
        char caracter = 'o';
        System.out.printf("En la cadena %s hay %d ocurrencia del caracter %c ", caracteres, contarCaracterEnCadena(caracteres, caracter), caracter );
    }

    public static int contarCaracterEnCadena(String a, char o) {
        int cont = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == o) {
                cont++;

            }
        }
        return cont;
    }


}
