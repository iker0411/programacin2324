package Tema2;

import java.util.Arrays;

public class Ejercicio7 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int elementodeBusqueda = 7;

        if (contieneElemento(array1, elementodeBusqueda)) {
            System.out.println("El array contiene el siguientes elementos " + elementodeBusqueda);
        }else {
            System.out.println("El array no contiene el siguientes elementos " + elementodeBusqueda);
        }
    }
    public static boolean contieneElemento(int[] array, int elemento) {
        for (int i = 0; i < array.length; i++){
            if (array[i] == elemento){
                return true;
            }
        }
        return false;
    }
}


