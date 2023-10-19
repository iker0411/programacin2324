package Boletin1_6;


import Boletin1_1.MientradaSalida;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, nota, apro = 0, sus = 0;
        double porcesapro, porcesus;

        num = MientradaSalida.leerEnteroPositivo("Dime el número de alumnos");

        for (int i = 1; i <= num; i++) {
            System.out.println("Dame la nota del alumno número: " + i);
            nota = sc.nextInt();
            if (nota >= 5) {
                apro++;
            } else if (nota < 5) {
                sus++;
            }
        }
        porcesapro = (double) apro / num * 100;
        porcesus = (double) sus / num * 100;

        System.out.println("Ha habido " + apro + " aprobados " + sus + " suspesos y un " + porcesus + "% de suspensos y un " + porcesapro + "% de aprobados");
    }
}

