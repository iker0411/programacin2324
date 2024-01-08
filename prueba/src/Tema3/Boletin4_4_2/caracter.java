package Tema3.Boletin4_4_2;

public class caracter {
    private String cadena;
    private int mayusculas, minuscula, numerica;

    public caracter(String cadena) {
        this.cadena = cadena;
        cuentacaracteres();
    }

    public String getCadena() {
        return cadena;
    }

    public int getMayusculas() {
        return mayusculas;
    }

    public int getMinuscula() {
        return minuscula;
    }

    public int getNumerica() {
        return numerica;
    }

    private void cuentacaracteres() {
        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isUpperCase(cadena.charAt(i))) {
                mayusculas++;
            } else if (Character.isLowerCase(cadena.charAt(i))){
                minuscula++;
            } else if (Character.isDigit(cadena.charAt(i))){
                numerica++;
            }


        }
    }

    public static void main(String[] args) {
        String cadena = "Hola Mundo, estoy haciendo un examen";
        Tema3.Boletin4_4_2.caracter caracteres = new caracter(cadena);
        System.out.println("En la frase cadena hay " + caracteres.getMinuscula() + " minusculas," + caracteres.getMayusculas() + " mayusculas, " + caracteres.getNumerica() + " digitos ");


    }


}
