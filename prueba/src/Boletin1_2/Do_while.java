package Boletin1_2;

import java.util.Scanner;

public class Do_while {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String contrasena;
        do {
            System.out.println("Cual es tu contraseña");
            contrasena = teclado.nextLine();

        } while (contrasena.length() < 8);
        System.out.println("Has introducido un contraseña correcta");
        teclado.close();


    }
}
