package Tema2.Matrices;

import java.util.Arrays;

public class Ejercicio8 {
    public static void main(String[] args) {
        int[][] matriz1 = {{5, 9, 6,}, {6,6,5}};
        int[][] matriz2 = {{1, 0, 6,}, {2,6,3}};

        System.out.print(Arrays.toString(matriz1));
    }
    public static int[][] sumMatriz(int [][] mA, int [][] mB){
        int [][] summMatrices = new int[mA.length][mA[0].length];

        for (int i = 0; i < mA.length; i++){
            System.out.println();
            for(int j = 0; j < mA[i].length; j++){
                summMatrices[i][j] = mA[i][j] + mB[i][j];
            }
        }
        return summMatrices;
    }
}
