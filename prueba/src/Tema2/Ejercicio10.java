package Tema2;

import java.util.Arrays;
import java.util.HashSet;

public class Ejercicio10 {


    public static void main(String[] args) {
        int[] arrayOriginal = {1, 2, 3, 2, 4, 5, 6, 1, 7, 8, 9, 10};

        int[] arraySinDuplicados = eliminarDuplicados(arrayOriginal);

        System.out.println("Array original: " + Arrays.toString(arrayOriginal));
        System.out.println("Array sin duplicados: " + Arrays.toString(arraySinDuplicados));
    }


    public static int[] eliminarDuplicados(int[] array) {
        HashSet<Integer> set = new HashSet<>();

        for (int elemento : array) {
            set.add(elemento);
        }

        int[] arraySinDuplicados = new int[set.size()];
        int index = 0;

        for (int elemento : set) {
            arraySinDuplicados[index++] = elemento;
        }

        return arraySinDuplicados;
    }
}


