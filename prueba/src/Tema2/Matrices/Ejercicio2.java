package Tema2.Matrices;


public class Ejercicio2 {
    public static void main(String[] args) {
        int[][] matriz = {{1,2,3},{4,5,6}};
        int  resultado = sumaM(matriz);
        System.out.println("El resultado de imprimir una matriz es " + resultado);
    }
    public static int sumaM (int[][]a){
        int suma = 0 ;
        for(int i = 0; i <a.length; i++){
            for (int j=0; j<a[0].length; j++) {
                suma = suma + a[i][j];
            }
        }
        return suma;
    }
}
