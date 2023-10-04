package Bolein1_1;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dos números para múltiplicar:\n");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3;
        sc.close();

        if (num1<num2);{
            num3=num2;
            num2=num1;
            num1=num3;
        }
        int resul = 0;
        for (int i = 1; i <= num2; i++){
            resul += num1;
        }
        System.out.printf("El resulatado es la mútiplicación es:\n " + resul);
    }
}
