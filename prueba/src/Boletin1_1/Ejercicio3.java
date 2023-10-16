package Boletin1_1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los núnmeros que quieras introducir");
        int cont = sc.nextInt();
        sc.nextLine();
        if (cont > 0) {
            for (int i = 1; i <= cont; i++) {
                System.out.printf("Dime el %2d valor\n", i);
                int num = sc.nextInt();
                sc.nextLine();
                if (num > 0){
                    if (num % 2 == 0) {
                        System.out.printf("%2d es par\n", num);
                    } else {
                        System.out.printf("%2d es impar\n", num);
                    }
                }else {
                    System.out.printf("Dame un número positivo porfavor\n");
                    i--;
                }


            }
        }
        System.out.printf("Nos vemos la procima\n");
        sc.close();
    }
}
