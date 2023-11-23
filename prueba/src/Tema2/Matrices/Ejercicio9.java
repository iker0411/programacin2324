package Tema2.Matrices;

public class Ejercicio9 {
    public static void main(String[] args) {
        // Ejemplo de matriz
        int[][] matriz = {
                {1, 3, 5, 6},
                {4, 2, 0, 8},
                {4, 2, 0, 8},
                {1, 3, 5, 6}
        };

        if (esMatrizSimetricaEnX(matriz)){
            System.out.println("Es simetrica en el eje x");
        } else{
            System.out.println("No es simetrica en el eje x");
        }
    }

    // Método para comprobar si una matriz es simétrica en el eje X
    public static boolean esMatrizSimetricaEnX(int[][] matriz) {
        boolean simetrica = true;
        int filas = matriz.length;
        int columnas = matriz[0].length;

        // Verificar que la matriz sea cuadrada
        if (filas != columnas) {
            simetrica = false;
        }

        for (int i = 0; simetrica && i < filas / 2; i++) {
            for (int j = 0; simetrica && j < columnas; j++) {
                if (matriz[i][j] != matriz[filas - 1 - i][j]) {
                    simetrica = false; // Elementos no coinciden
                }
            }
        }

        return simetrica; // La matriz es simétrica en el eje X
    }
}
