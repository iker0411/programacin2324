package Tema2.Arrays;

public class Ejercicio2 {
    public static void main(String[] args) {
        int[] miArray={-1,-2,-3,-4,-5,-6,-7,-8,-9, -10, -11};
        int resta  = 0;

        for (int i = 0; i < miArray.length; i++){
            if(miArray[i]<0){
                resta ++;
            }
        }
        System.out.println("La cantidad de números negativos que hay en la array es " + resta);
    }
}
