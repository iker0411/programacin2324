package Boletin1_1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            System.out.println("Introduce un número positivo\n");
            num = sc.nextInt();
        }while (num <= 0);
        int suma = 0;
        for (int i = 1;i <= num; i++){
            suma += i;
        }
        System.out.printf("La sumad e los %d primero números es %d\n",num ,suma);
    }
}
