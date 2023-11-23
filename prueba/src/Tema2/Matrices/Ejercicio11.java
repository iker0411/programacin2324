package Tema2.Matrices;

public class Ejercicio11 {
    public static void main(String[] args) {
        // Ejemplo de matrices
        int[][] matriz1 = {
                {5, 8, 9, 0},
                {4, 7, 5, 2},
                {1, 7, 3, 2}
        };

        int[][] matriz2 = {
                {2, 3, 7, 1},
                {2, 5, 7, 4},
                {0, 9, 8, 5}
        };

        // Llamada al método
        if (sonMatricesInversas(matriz1, matriz2)){
            System.out.println("Las matrices son inversas");
        }else {
            System.out.println("Las matrices no son inversas");
        }
    }

    // Método para comprobar si dos matrices son inversas
    public static boolean sonMatricesInversas(int[][] matriz1, int[][] matriz2) {
        boolean inversas = true;
        int filas = matriz1.length;
        int columnas = matriz1[0].length;

        // Verificar que las matrices tengan las mismas dimensiones
        if (filas != matriz2.length || columnas != matriz2[0].length) {
            inversas = false;
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz1[i][j] != matriz2[filas - 1 - i][columnas - 1 - j]) {
                    inversas = false; // Elementos no coinciden
                }
            }
        }

        return inversas; // Las matrices son inversas
    }
}
