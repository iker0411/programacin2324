package Bolein1_1;

import java.util.Scanner;

public class EJERCICIO4_RELACION_DE_PROBLEMAS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,min =Integer.MAX_VALUE,max =Integer.MIN_VALUE, suma = 0,divisor = 0;
        double media;

        do {
            System.out.println("Introduce números hasta que introduczcas -1 para salir");
            num = sc.nextInt();
            if (num >= 0) {
                suma += num;
                divisor += 1;
            }
            if (num > max && num >= 0) {
                max = num;
            }
            if (num < min && num >= 0){
                min = num;
            }
        }while(num != -1);

        media = (double)suma/divisor;

        System.out.println("La media de los número da " + media + ", el número mínimo es " + min + " y el número máximo es " + max );


    }
}

