package Tema3.Boletin4_4_6;

public class principal3 {
    public static void main(String[] args) {
        desordenarCadena2("Cocacola");
    }

    public static String desordenarCadena2(String cadena) {
        StringBuilder frase = new StringBuilder(cadena.toLowerCase().replaceAll("\\s+", ""));
        int cont = 0;
        for (int i = 0; cont < frase.length(); i++) {
            switch (frase.charAt(i)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    frase.append(frase.charAt(i));
                    frase.deleteCharAt(i);
                    i--;
            }
            cont++;
        }
        return frase.toString();
    }
}
