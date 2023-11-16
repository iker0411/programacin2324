package Tema2.Arrays;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numP;
        int contMax = 0, contMin = 0;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        double suma = 0;

        do {
            System.out.println("Dime el número de posiciones que tendrá el array");
            numP = sc.nextInt();
        } while (numP < 1);

        int[] num = new int[numP];

        for (int i = 0; i < numP; i++) {
            System.out.printf("Posición %d del array: ", i);
            num[1] = sc.nextInt();
            if (num[i] > max){
                if (num[i] == max){
                    contMax++;

                }else {
                    max = num[i];
                    contMax = 1;
                }
            }
            if (num[i] < min){
                if (num[i]==min){
                    contMin++;
                }else{
                    min = num[i];
                    contMin = 1;
                }
            }
            suma += num[i];
        }
        System.out.printf("El mayor valor es; %d. Se repite %d ", max, contMax);
        System.out.printf("El mayor valor es; %d. Se repite %d", min, contMin);
        System.out.printf("El mayor valor es; %f", suma/numP);
        sc.close();
    }
}

