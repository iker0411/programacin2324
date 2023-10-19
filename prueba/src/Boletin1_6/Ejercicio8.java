package Boletin1_6;

import Boletin1_1.MientradaSalida;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, result;

        a = MientradaSalida.leerEntero("Introduce valor de a");
        b = MientradaSalida.leerEntero("Introduce el valor de b");
        c = MientradaSalida.leerEntero("Introduce el valor de c");

        result = (b * b) - 4 * a * c;

    }

    }

