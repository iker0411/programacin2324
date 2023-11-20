package Tema2.Matrices;

public class Ejercicio5 {
    public static void main(String[] args) {
        int [][] matriz = {{3,1,2}, {0, 2, 7}};
        iee(matriz);
    }
    public static void iee (int[][] a){
        for (int j = 0; j < a[0].length; j++){
            for (int i = 0; i < a.length; i++){
                System.out.print(a[i][j] + " ");
            }
        }
        System.out.println();
    }
}
