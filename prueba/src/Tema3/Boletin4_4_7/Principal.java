package Tema3.Boletin4_4_7;


public class Principal {
    public static void main(String[] args) {
        desordenarCadena("Cocacola");
    }

    public static void desordenarCadena(String cadena) {
        cadena = cadena.toLowerCase();
        StringBuilder cadenaVocales = new StringBuilder();
        StringBuilder cadenaConsolantes = new StringBuilder();

        for (int i = 0; i < cadena.length(); i++) {
            switch (cadena.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    cadenaVocales.append(cadena.charAt(i));
                    break;
                default:
                    cadenaConsolantes.append(cadena.charAt(i));
            }
        }
        System.out.println(cadenaConsolantes.append(cadenaVocales));
    }
}
