package Tema2.Matrices;

public class Ejercicio10 {
    public static void main(String[] args) {
        // Ejemplo de matriz
        int[][] matriz = {
                {1, 3, 0, 3, 1},
                {4, 2, 7, 2, 4},
                {6, 1, 9, 1, 6},
                {0, 8, 8, 8, 0}
        };

        if (esMatrizSimetricaEnY(matriz)) {
            System.out.println("Es simetrica en el eje x");
        } else {
            System.out.println("No es simetrica en el eje x");
        }
    }
    // Método para comprobar si una matriz es simétrica en el eje Y
    public static boolean esMatrizSimetricaEnY(int[][] matriz) {

        boolean simetrica = true;
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; simetrica && i < filas; i++) {
            for (int j = 0; simetrica && j < columnas / 2; j++) {
                if (matriz[i][j] != matriz[i][columnas - 1 - j]) {
                    simetrica = false; // Elementos no coinciden
                }
            }
        }

        return simetrica; // La matriz es simétrica en el eje Y
    }
}
