package Tema2;

public class RecorridoArray {
    public static void main(String[] args) {
        int[] miArray = new int[5];
        int[] miArray2 = {1,2,3,4,5};

        for (int i = miArray2.length -1; i >=0; i--){
            System.out.println(miArray[miArray.length-1-i] = miArray2[i]);
        }
        for (int elem: miArray){
            System.out.println(elem);
        }

    }
}
