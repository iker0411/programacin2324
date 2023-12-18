import java.util.Scanner;

public class Miprimerproyecto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el tipo de vehóculo (coche, moto, camión)");
        String tipovehiculo = sc.nextLine();

        if (tipovehiculo.equals("coche")){
            System.out.println("velocidad = 120km/h");
        }
        else if (tipovehiculo.equals("moto")){
            System.out.println("velocidad = 90km/h");
        }
        else if (tipovehiculo.equals("camión")){
            System.out.println("velocidad = 80km/h");
            //
        }
        else{
            System.out.println("No hay más vehiculos");
        }
    }
}
