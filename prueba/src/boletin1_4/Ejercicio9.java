package boletin1_4;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
        char letra;
        double precio;


        System.out.print("Dim el tipo de producto, A,B,C: ");
        do {
            letra = sc.nextLine().toUpperCase().charAt(0);
            if (letra != 'A' && letra != 'B' && letra != 'C') {
                System.out.print("Introduce uno de los tipos que se te indican: ");
            }
        } while (letra != 'A' && letra != 'B' && letra != 'C');

        System.out.print("Dim el precio del producto: ");
        do {
            precio = Double.parseDouble(sc.nextLine());
            if (precio <= 0) {
                System.out.print("Introduce un precio positivo: ");
            }
        } while (precio <= 0);

        if (letra == 'A') {
            precio = precio - precio * 7 / 100;
            System.out.println("El precio total es de: " + precio);
        }
        else if (letra == 'C' || precio < 500) {
            precio = precio - precio * 12 / 100;
            System.out.println("El precio total es de: " + precio);
        }
        else{
            precio = precio - precio * 9 / 100;
            System.out.println("El precio total es de: " + precio);
        }

    }



    }

