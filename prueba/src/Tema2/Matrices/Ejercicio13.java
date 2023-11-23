package Tema2.Matrices;

public class Ejercicio13 {
    public static void main(String[] args) {
        int[][] matrizOriginal = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 0},
                {3, 2, 1, 4, 5},
                {9, 5, 8, 6, 7},
                {0, 9, 8, 5, 4}
        };



        if (obtenerMatrizReflejo(matrizOriginal) != null) {
            imprimirMatriz(obtenerMatrizReflejo(matrizOriginal));
        } else {
            System.out.println("La matriz no es cuadrada.");
        }
    }

    public static int[][] obtenerMatrizReflejo(int[][] matriz) {
        // Comprobar si la matriz es cuadrada
        int filas = matriz.length;
        int columnas = matriz[0].length;

        if (filas != columnas) {
            System.out.println("La matriz no es cuadrada.");
            return null;
        }

        // Crear una nueva matriz para el reflejo en diagonal
        int[][] reflejo = new int[filas][columnas];

        // Calcular el reflejo en diagonal
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < filas; j++) {
                reflejo[i][j] = matriz[columnas - 1 - j][filas - 1 - i];
            }
        }

        return reflejo;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
