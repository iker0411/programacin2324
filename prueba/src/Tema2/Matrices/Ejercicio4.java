package Tema2.Matrices;

public class Ejercicio4 {
    public static void main(String[] args) {
        int [][] matriz = {{4,9,3},{9,6,2}};
        To(matriz);
    }
    public static void To (int[][]a){
        for (int i = a.length -1; i >= 0; i--){
            for (int j = a[i].length -1; j >=0; j--){
                System.out.print(a[i][j] + " ");
            }
        }
    }
}
