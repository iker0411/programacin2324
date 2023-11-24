public class PrincipalAlumnos {
    public static final int TAM = 4;
    public static final int INTENTOS = 5;
    public static final char OCULTO = '#';




    public static void main(String[] args) {

        char[][] matriz = new char[TAM][TAM];
        boolean[][] matrizVisible = new boolean[TAM][TAM];

        /*
        matrizVisible es una matriz de booleanos que nos servirá para saber si una celda está visible u oculta.
        Por defecto, todas las celdas estarán ocultas, por lo que inicializamos la matriz a false.
         */
        ocultarTodaLaMatriz(matrizVi);


        /*
         * La estrategia que seguiremos será la siguiente: Rellenaremos la matriz con los valores de la A a la letra final
         * (que vendrá determinada por A + TAM * TAM / 2) dos veces. Una vez rellenada la matriz, la recorreremos y cambiaremos
         * su valor por otra celda de la matriz obtenida aleatoriamente.
         */

        fillMatrix(matriz);
        printMatrix(matriz);
        randomizeMatrix(matriz);
        printMatrix(matriz);

        // TODO: Aplicar la lógica descrita del juego


        if (checkFinished(matrizVi)){
            System.out.println("¡Enhorabuena! Has ganado");
        }
        else {
            System.out.println("¡Vaya! Has perdido. Vuelve a jugar otra vez.");
        }
    }

    /**
     * Imprime la matriz por pantalla
     * @param matriz
     */
    private static void printMatrix(char[][] matriz) {
        for(int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[0].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Imprime la matriz visible por pantalla, mostrando las celdas ocultas con el valor de la constante OCULTO
     * @param matriz
     * @param matrizVisible
     */
    private static void printVisibleMatrix(char[][] matriz, char[][] matrizVi) {
        for(int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[0].length; j++){
                System.out.print(matriz[i][j] + " ");

            }
        }
    }


    /**
     * Rellena la matriz con los valores de la A a la letra final (que vendrá determinada por A + TAM * TAM / 2) dos veces
     * @param matriz
     */
    public static void fillMatrix(char[][] matriz) {

    }

    /**
     * Desordena la matriz
     * @param matriz
     */
    private static void randomizeMatrix(char[][] matriz) {
        // Una vez rellena la matriz, la desordenamos

    }

    /**
     * Hace que todas las celdas de la matriz sean false (ocultas)
     * @param matrizVisible
     */
    private static void ocultarTodaLaMatriz(char[][] matrizVisible) {

    }

    /**
     * Comprueba si todas las celdas de la matriz son true (visibles)
     * @param matrizVisible
     * @return
     */
    private static boolean checkFinished(char[][] matrizVisible) {

    }

}
