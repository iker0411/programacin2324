package Tema2.Matrices;

import java.util.Arrays;

public class Ejercicio8 {
    public static void main(String[] args) {
        // Ejemplo de matrices
        int[][] matriz1 = {
                {1, 2, 5},
                {4, 6, 9}
        };

        int[][] matriz2 = {
                {4, 1, 8},
                {1, 0, 2}
        };

        // Llamada al método y mostrar el resultado
        int[][] matrizSuma = sumarMatrices(matriz1, matriz2);
        mostrarMatriz("Matriz resultado de la suma:", matrizSuma);
    }

    // Método para sumar dos matrices y devolver la matriz resultante
    public static int[][] sumarMatrices(int[][] matriz1, int[][] matriz2) {
        if (matriz1.length != matriz2.length || matriz1[0].length != matriz2[0].length) {
            System.out.println("Las matrices no son del mismo tamaño.");
            return null;
        }

        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        int[][] matrizSuma = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizSuma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        return matrizSuma;
    }

    // Método para mostrar una matriz en la consola
    public static void mostrarMatriz(String mensaje, int[][] matriz) {
        System.out.println(mensaje);
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}
