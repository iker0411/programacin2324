package Boletin1_1;

import java.util.Scanner;

public class Ejecicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 100; i++){
            boolean multilode7 = i % 7 == 0;
            boolean multilode13 = i % 13 == 0;
            if (multilode7){
                if (multilode13){
                    System.out.printf("El numero es multiplo de 7 y 13\n",i);
                }
                else {
                    System.out.printf("El numero es multiple de 7\n " ,i);
                    //solo multiplo de 7
                }
            }
            else {
                if (multilode13){
                    System.out.printf("El numero es multiple de 13\n " ,i);
                    // solo de 13
                }
            }
        }
    }
}

