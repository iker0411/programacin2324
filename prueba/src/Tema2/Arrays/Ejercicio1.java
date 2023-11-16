package Tema2.Arrays;

public class Ejercicio1 {
    public static void main(String[] args) {
        int [] miArray = {1,2,3,4,5,6,7,8,9};

        int suma = 0;

        for (int i = 0; i < miArray.length; i++){
            if (i % 2 == 0){
                suma += miArray[i];
            }
        }
        System.out.printf("La suma de las posiciones apres es %d ", suma);
    }
}
