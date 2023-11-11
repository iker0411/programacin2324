package Tema2;

public class Ejercicio12 {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6, 4, 8, 10, 12, 7, 11};
        bubbleSort(array);
        printArray(array);
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}


