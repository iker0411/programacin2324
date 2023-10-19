package Boletin1_6;

import Boletin1_1.MientradaSalida;

import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        int temp;


        num1 = MientradaSalida.leerEnteroPositivo("Dame un número positvo");
        num2 = MientradaSalida.leerEnteroPositivo("Dame el segundo número postivo");

        int guar1 = num1;
        int guar2 = num2;

        if (num1 > num2) {
            num3 = num1;
            num1 = num2;
            num2 = num3;
        }
        while (num2 != 0) {
            temp = num1;
            num1 = num2;
            num2 = temp % num2;

        }

        System.out.println("El mayor divisor de " + guar1 + " y " + guar2 + " es " + num1);

    }
}
