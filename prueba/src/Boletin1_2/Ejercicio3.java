package Boletin1_2;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tres notas de tús exámenes");
        double nota = sc.nextInt();
        double nota2 = sc.nextInt();
        double nota3 = sc.nextInt();
        double res = (nota + nota2 + nota3 / 3 );
        System.out.println("Tu promedio es " + res);
        sc.close();
    }

}
