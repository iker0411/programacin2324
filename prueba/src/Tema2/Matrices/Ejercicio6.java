package Tema2.Matrices;

public class Ejercicio6 {
    public static void main(String[] args) {
        int [][] matriz = {{3,8,2}, {0, 2, 7}};
        leer(matriz);
    }
    public static void leer (int [][] a){
        System.out.println("La salida es: ");
        for (int j = a[0].length -1; j >= 0; j--){
            for (int i = a.length -1; i >=0; i--){
                System.out.print(a[i][j] + " ");
            }
        }
    }
}
