package Tema2.Matrices;

public class Ejercicio7 {
    public static void main(String[] args) {
        // Ejemplo de matrices
        int[][] matriz1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matriz2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        if(matricesIguales(matriz1, matriz2)){
            System.out.println("las matrices son iguales");
        }
        else{
            System.out.println("Las matrices son diferentes");
        }
    }

    // Método para comprobar si dos matrices son exactamente iguales
    public static boolean matricesIguales(int[][] matriz1, int[][] matriz2) {
        boolean iguales = true;

        if (matriz1.length != matriz2.length) {
            iguales = false; // Las matrices tienen dimensiones diferentes
        }

        for (int i = 0; iguales && i < matriz1.length; i++) {
            iguales = matriz1[i].length == matriz2[i].length;
            for (int j = 0; iguales && j < matriz1[0].length; j++) {
                if (matriz1[i][j] != matriz2[i][j]) {
                    iguales = false; // Se encontró al menos un elemento diferente
                }
            }
        }

        return iguales; // Las matrices son exactamente iguales
    }
}
