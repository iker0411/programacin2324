package Tema2.Arrays;

public class Ejercicio8 {
    public static void main(String[] args) {
        int[] array={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int valorBuscado = 10;
        int posicion = buscarposicion(array, valorBuscado);

        if (posicion != -1){
            System.out.println("El valor " + valorBuscado + " se encuentra en la posición " + posicion);
        }else {
            System.out.println("El valor " + valorBuscado + " no se presente en la array");
        }
    }
    public static int buscarposicion(int[] array, int valor){
        for (int i = 0; i < array.length; i++){
            if (array[i] == valor){
                return i;
            }
        }
        return -1;
    }


}
