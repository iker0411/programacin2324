package Boletin1_6;


import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vidas = 5;
        int num1;
        Random r = new Random();
        int aleatorio = r.nextInt(100) + 1;
        System.out.println(aleatorio);
        //Necesito un aleatorio del 1 a 100
        while (vidas != 0) {
            System.out.println("Dime un número");
            num1 = sc.nextInt();

            if (num1 < aleatorio) {
                System.out.println("El número es mayor");
                vidas--;

            } else if (num1 > aleatorio) {
                System.out.println("El número es mayor");
                vidas--;
            } else if (num1 == aleatorio) {
                System.out.println("Eres un crack, ¿un piquito?");
                break;
            }
        }
        if (vidas == 0) {
            System.out.println("Has perdido, el número era " + aleatorio);
        }
    }
}
