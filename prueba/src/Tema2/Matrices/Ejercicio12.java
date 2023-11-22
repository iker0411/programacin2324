package Tema2.Matrices;

public class Ejercicio12 {
    public static void main(String[] args) {
        int[][] matriz = {
                {5, 7, 8, 9},
                {4, 9, 6, 5},
                {4, 6, 8, 0},
                {3, 6, 9, 1}

        };
    }

    public static int[][] invertida(int[][] a){
        int[][] invertida = new int[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; i++) {
                invertida[i][j] = a[j][i];
                System.out.println();
            }
        }
        return invertida;
    }
}
