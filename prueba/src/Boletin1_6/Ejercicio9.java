package Boletin1_6;


import java.awt.font.FontRenderContext;

public class Ejercicio9 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            System.out.println("Tablas de multiplicar " + i + ":");
            for (int j = 0; j<= 10; j++){
                System.out.println(i+"x"+ j+ "=" + (i+j));
                System.out.printf("%2d x %2d = %3d \n", i, j , i*j);
            }
        }
    }
}
