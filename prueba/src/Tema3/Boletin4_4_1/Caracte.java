package Tema3.Boletin4_4_1;

public class Caracte {
    public static void main(String[] args) {
        String caracteres = "Hola mundo";
        char caracter = 'h';
        System.out.printf("En la cadena %s hay %d ocurrencia del caracter %c ", caracteres, contarCaracterEnCadena(caracteres, caracter), caracter );
    }

    public static int contarCaracterEnCadena(String a, char o) {
        int cont = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.toLowerCase().charAt(i) == Character.toLowerCase(o)) {
                cont++;
            }
        }
        return cont;
    }


}
