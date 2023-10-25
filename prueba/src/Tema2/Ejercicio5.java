package Tema2;

import Boletin1_1.MientradaSalida;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ejercicio5 {
    public static final int MAX_RANDOM = 1000;
    public static void main(String[] args) {
        int tamArray = MientradaSalida.leerEnteroPositivo("Introduce el tamaño del array");

       int[] arrayAleatorio = generaArrayAleatorio(tamArray);

       for (int elem: arrayAleatorio){
           System.out.println(elem);
       }

    }
    public static int[] generaArrayAleatorio(int tamArray){
        int[] miArray = new int [tamArray];

        for (int i = 0; i < miArray.length; i++){
            miArray[i] = (int) (Math.random()*(MAX_RANDOM + 1));
        }
        return miArray;
    }
}
