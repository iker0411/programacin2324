package Tema3.Boletin4_4_10;

public class Principal {
    public static void main(String[] args) {
        System.out.println(esDirreccionValida("http://wwww.marca.es"));
    }

    public static boolean esDirreccionValida(String direccion) {
        String comienzoCorrecto = "http://www";
        String[] direccionDividida = direccion.split("\\.");

        //for (String s : direccionDividida){
        //    System.out.println(s);
        //}
        if (direccionDividida.length != 3){
            return false;
        }

        if (!comienzoCorrecto.equals(direccionDividida[0])) {
            return false;
        }
        if (direccionDividida[1].contains(" ")){
            return  false;
        }
        if (Character.isDigit(direccionDividida[1].charAt(0))){
            return false;
        }
        if (!direccionDividida[2].equals("es") && !direccionDividida[2].equals("com")){
            return false;
        }
        return true;

    }
}
