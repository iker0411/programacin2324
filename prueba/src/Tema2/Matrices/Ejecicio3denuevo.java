package Tema2.Matrices;

public class Ejecicio3denuevo {
    public static void main(String[] args) {
        int [][] matriz = {{4,9,3},{9,6,2}};
        to(matriz);
    }
    public static void to (int[][]a){
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; i++){
                System.out.println(a[i][j] + " ");
            }
        }
    }
}
