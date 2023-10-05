package Boletin1_2;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km, vel;
        int horas, min, seg;
        System.out.println("Dime a que distancia esta tu destino:");
        km = Double.parseDouble(sc.nextLine());
        System.out.println("Dime la velocidad a la que vas: ");
        vel = Double.parseDouble(sc.nextLine());
        double tiempo = km/vel;
        System.out.println(tiempo);
        horas = (int)tiempo;
        min = (int) ((tiempo-horas)*60);
        seg = (int) (((tiempo*60) - (horas * 60) -min)*60);
        System.out.printf("%d:%d:%d", horas, min, seg);
         sc.close();

    }
}
