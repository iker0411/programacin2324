package Tema2.Matrices;

public class Ejercicio3 {
    public static void main(String[] args) {
        int [][] matriz = {{3, 7,-3}, {4, 7,9}};
        linea(matriz);
    }
    public static void linea (int[][] a){
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
        }

    }
}
