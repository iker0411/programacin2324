import java.util.Scanner;
import java.util.WeakHashMap;

public class PrincipalAlumnos {
    public static final int TAM = 4;
    public static final int INTENTOS = 5;
    public static final char OCULTO = '#';


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] matriz = new char[TAM][TAM];
        boolean[][] matrizVisible = new boolean[TAM][TAM];


        /*
        matrizVisible es una matriz de booleanos que nos servirá para saber si una celda está visible u oculta.
        Por defecto, todas las celdas estarán ocultas, por lo que inicializamos la matriz a false.
         */
        ocultarTodaLaMatriz(matrizVisible);


        /*
         * La estrategia que seguiremos será la siguiente: Rellenaremos la matriz con los valores de la A a la letra final
         * (que vendrá determinada por A + TAM * TAM / 2) dos veces. Una vez rellenada la matriz, la recorreremos y cambiaremos
         * su valor por otra celda de la matriz obtenida aleatoriamente.
         */

        fillMatrix(matriz);
        randomizeMatrix(matriz);
        int intentosRestan = INTENTOS;
        // TODO: Aplicar la lógica descrita del juego
        while (intentosRestan > 0 && !checkFinished(matrizVisible)){
            printVisibleMatrix( matriz, matrizVisible);
            System.out.println("Actualemente tienes " + intentosRestan + " intentos para adivinarlo");
            System.out.println("Dime la fila que quieras ver: (0-3) ");
            int pfilas1 = sc.nextInt();
            System.out.println("Dime la columna que quieres ver: (0-3) ");
            int pcolum1 = sc.nextInt();
            if(pfilas1 > 3 || pcolum1 > 3){
                System.out.println("Introduce un valor que este entre el 0 y el 3");
                intentosRestan --; //Si se pasa de la matriz te quita un intento.
                continue;
            }
            if (matrizVisible[pfilas1][pcolum1]){
                System.out.println("Esta casilla ya existe");
            }else{
                matrizVisible[pfilas1][pcolum1] = true;
                printVisibleMatrix(matriz, matrizVisible);
            }

            System.out.println("Dime la fila que quieras ver: (0-3) ");
            int pfilas2 = sc.nextInt();
            System.out.println("Dime la columna que quieres ver: (0-3) ");
            int pcolum2 = sc.nextInt();
            if(pfilas2 > 3 || pcolum2 > 3){
                System.out.println("Introduce un valor que este entre el 0 y el 3");
                intentosRestan --;
                continue;
            }
            if (matrizVisible[pfilas2][pcolum2]){
                System.out.println("Esta casilla ya existe");
                matrizVisible[pfilas1][pcolum1] = false;
            }else{
                matrizVisible[pfilas2][pcolum2] = true;
                printVisibleMatrix(matriz, matrizVisible);
            }
            if (matriz[pfilas1][pcolum1] != matriz[pfilas2][pcolum2]){
                System.out.println("No coinciden ninguna letra");
                matrizVisible[pfilas1][pcolum1] = false;
                matrizVisible[pfilas2][pcolum2] = false;
                intentosRestan --;
            }else {
                System.out.println("Todas las letras que has introduccido coinciden");
            }


        }

        if (checkFinished(matrizVisible)) {
            System.out.println("¡Enhorabuena! Has ganado");
        } else {
            System.out.println("¡Vaya! Has perdido. Vuelve a jugar otra vez.");
        }
    }

    /**
     * Imprime la matriz por pantalla
     *
     * @param matriz
     */
    private static void printMatrix(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Imprime la matriz visible por pantalla, mostrando las celdas ocultas con el valor de la constante OCULTO
     *
     * @param matriz
     * @param matrizVisible
     */
    private static void printVisibleMatrix(char[][] matriz, boolean[][] matrizVisible) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matrizVisible[i][j]) {
                    System.out.print(matriz[i][j] + " ");
                } else {
                    System.out.print(OCULTO + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }


    /**
     * Rellena la matriz con los valores de la A a la letra final (que vendrá determinada por A + TAM * TAM / 2) dos veces
     *
     * @param matriz
     */
    public static void fillMatrix(char[][] matriz) {
        char le = 'A'; // le es letra
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j]=le;
                le++;
                if (le > 'A' + TAM * TAM /2){
                    le='A';
                }
            }
        }

    }


    /**
     * Desordena la matriz
     *
     * @param matriz
     */
    private static void randomizeMatrix(char[][] matriz) {
        char guardadoTempo; //Guardo temporalmente el valor, cuando valla a hacer intercambios.
        int a, b; // a es la fila y b es la columna
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                a = (int) (Math.random() * matriz.length); // Le da un valor aleatorio a la letra a
                b = (int) (Math.random() * matriz.length); // Le da un valor aleatorio a la letra b
                guardadoTempo = matriz[i][j]; // Cogemos la matriz con sus columnas y filas, lo que se conlleva que se guarde en el valor(guardadotempo).
                matriz[i][j] = matriz[a][b]; // Sobreescribe el valor [i][j], con el valor [a][b], ya que son una posición aleatoria.
                matriz[a][b] = guardadoTempo; // Las pociones aleatoia recibe el valor (guardadotempo).
            }
        }
    }

    /**
     * Hace que todas las celdas de la matriz sean false (ocultas)
     *
     * @param matrizVisible
     */
    private static void ocultarTodaLaMatriz(boolean[][] matrizVisible) {
        for (int i = 0; i < matrizVisible.length; i++) {
            for (int j = 0; j < matrizVisible[0].length; j++) {
               matrizVisible[i][j] = false;
            }
        }
    }

    /**
     * Comprueba si todas las celdas de la matriz son true (visibles)
     *
     * @param matrizVisible
     * @return
     */
    private static boolean checkFinished(boolean[][] matrizVisible) {
        for (int i = 0; i < matrizVisible.length; i++) {
            for (int j = 0; j < matrizVisible[0].length; j++) {
               if (!matrizVisible[i][j]){
                   return false;
               }
            }
        }
        return true;
    }

}
