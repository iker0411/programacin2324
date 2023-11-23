package Tema2.Matrices;

public class Ejercicio16 {
    public static void main(String[] args) {

        int[][] m = {{1,2,3,4,5} , {6,7,8,9,0} , {3,2,1,4,5} , {9,5,8,6,7} , {0,9,8,5,4}};

        for (int i = 0; i < comprobarAdyacente(m).length; i++){
            for (int j = 0; j <  comprobarAdyacente(m)[i].length; j++) {

                System.out.print(comprobarAdyacente(m)[i][j] + " ");

            }
            System.out.println();
        }

    }

    public static int [][] comprobarAdyacente(int [][] a){

        int [][] m1 = new int[a.length][a[0].length];
        int cont = 0;

        for (int i = 0; i < a.length;i++){
            for (int j = 0; j < a[i].length;j++){

                for (int minI = i - 1; minI < i + 2;minI++){
                    for (int minJ = j - 1; minJ < j + 2; minJ++){

                        if (minI >= 0 && minJ >= 0 && minJ < a[0].length && minI < a.length){

                            if ( a[minI][minJ] % 2 == 0){
                                cont++;
                            }
                        }
                    }
                }
                if (a[i][j] % 2 == 0){
                    cont--;
                }
                m1[i][j] = cont;
                cont = 0;
            }
        }
        return m1;
    }
}
