package Boletin1_6;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroAlumnos = 0;
        do {
            System.out.println("Cuantos alunmos hay en una clase");
            numeroAlumnos = sc.nextInt();

        } while (numeroAlumnos < 1);

        for (int i = 1; i <= numeroAlumnos; i++){
            System.out.println("Dime la notas de los alumnos");
            int notas = sc.nextInt();
        }
    }
}
