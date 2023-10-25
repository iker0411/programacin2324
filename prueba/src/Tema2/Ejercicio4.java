package Tema2;

import java.util.Random;

public class Ejercicio4 {
    private static final int NUM_REPETICIONES = 10;
    private static final int MIN_RANDOM = 0;
    private static final int MAX_RANDOM = 100;
    public static void main(String[] args) {
        Random rnd = new Random();
        double suma = 0;
        int[] terminaciones =  new int[10];
        for (int i = 0; i <= NUM_REPETICIONES; i++){
            int aleat = rnd.nextInt(MAX_RANDOM);
            suma += aleat;
            terminaciones[aleat % 10]++;
        }
        int postMax = 0;
        int maxValue = Integer.MIN_VALUE;

        //En este for voy a mostrar el números  de veces que se ha repetido el dígito final
        for (int i = 0; i < terminaciones.length; i++) {
            System.out.printf("El n %d se ha repetido %d veces. Esto equivale a un %.2f%%\n", i,terminaciones[i], (double)terminaciones[i] / NUM_REPETICIONES * 100);
        }
        //En este for busco el dígito en el que han terminado más números
        for (int i = 0; i < terminaciones.length; i++){
            if (terminaciones[i] > maxValue){
                maxValue = terminaciones[i];
                postMax = i;
            }
        }

        for (int i = 0; i < terminaciones.length; i++){
           if (terminaciones[i] == maxValue){
               System.out.printf("El digito %d es en el más números han terminado (%d veces)\n ", i, maxValue);
           }
        }

        System.out.printf("La media de los números es %.2f\n", (double)suma / NUM_REPETICIONES);

        for (int i = 0; i < terminaciones.length; i++){
            if (terminaciones[1] == 0){
                System.out.printf("No ha habido ningún número que terminase en %d\n ", i);
            }
        }
    }
}
