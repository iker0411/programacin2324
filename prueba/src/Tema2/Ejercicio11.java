package Tema2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a1 = {1, 2, 3};
        int[] a2 = { 5, 1, 5};
        int[] a3 = eliminarDuplicados(a1, a2);
        System.out.println(Arrays.toString(a3));
    }
    public static int[] eliminarDuplicados(int[] a1, int[] a2){
        int[] a3 = new int[a2.length];
        int elementosAnadidos = 0;
        for (int i = 0; i < a2.length; i++){
            if (indexOf(a1, a2[i]) != -1){
                a3[elementosAnadidos++] = a2[i];
            }
        }
        int[] a4 = new int[elementosAnadidos];
        for (int i  = 0; i < elementosAnadidos; i++){
            a4[i] = a3[i];
        }
        return a4;
    }
    public static int indexOf(int[] a, int elem) {
        int pos = -1;
        for (int i = 0; i < a.length && pos == -1; i++) {
            if (a[i] == elem) {
                pos = i;
            }
        }
        return pos;
    }
    }

