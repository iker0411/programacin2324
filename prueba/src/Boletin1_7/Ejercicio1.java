package Boletin1_7;

import Boletin1_1.MientradaSalida;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inverso = 0;

        int num = MientradaSalida.leerEnteroPositivo("Introduce un número positivo");
        int num1 = num;
        while (num != 0){
            inverso = inverso * 10 + num%10;
            num/=10;
        }
        System.out.println(inverso);


    }
}
