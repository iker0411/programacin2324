import java.util.Scanner;

/**
 * @author Iker Méndez Palma 1ºDAM
 */

public class PrincipalAlumnos {
    public static final int TAM = 4; //Se utiliza para saber el tamaño que tiene la matriz.
    public static final int INTENTOS = 5; //Se utiliza para saber cuantos intentos tenemos en la matriz.
    public static final char OCULTO = '#'; //Se utiliza para ocultar la matriz.


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] matriz = new char[TAM][TAM]; //Se define la matriz tipo char, para poder introducirle letras, le definimos el tamaño "TAM", que ya esta declarado anteriormente
        boolean[][] matrizVisible = new boolean[TAM][TAM]; //Se define la matrizVisible tipo boolean para que cuando sea verdadera se muestre y cuando sea falsa no se muestre. Ponemos TAM, para definir el tamaño de filas y colunmas.

        ocultarTodaLaMatriz(matrizVisible); //Lo que hace este metodo, es que oculta la matriz al principio del programa para ocultar las casillas, que aún no ha sido adivinadas.


        fillMatrix(matriz); // Su función es llenar las matrices que tienen letras, ya que aún no está desordenadas.
        randomizeMatrix(matriz); //Este método lo que hace es que coge todas las letras del fillMatriz y lo desordena.
        int intentosRestan = INTENTOS;
        while (intentosRestan > 0 && !checkFinished(matrizVisible)) { //El juego se ejecutará mientra la matriz sea visible, y si no es visible no se ejecutará completamente.
            printVisibleMatrix(matriz, matrizVisible);
            System.out.println("Actualemente tienes " + intentosRestan + " intentos para adivinarlo"); //El usuario nos pone las cordenadas que quiere saber.
            System.out.println("Dime la fila que quieras ver: (0-3) ");
            int pfilas1 = sc.nextInt();
            System.out.println("Dime la columna que quieres ver: (0-3) ");
            int pcolum1 = sc.nextInt();
            if (pfilas1 > 3 || pcolum1 > 3) { //Si el usuario se sale fuera de la matriz, sale un mensaje de error.
                System.out.println("Introduce un valor que este entre el 0 y el 3");
                intentosRestan--; //Si se pasa de la matriz te quita un intento.
                continue;
            }
            if (matrizVisible[pfilas1][pcolum1]) { //Si la cordennada que ha puesto el usuario, existe se mostrará por mensaje.
                System.out.println("Esta casilla ya existe");
            } else {
                matrizVisible[pfilas1][pcolum1] = true;
                printVisibleMatrix(matriz, matrizVisible);
            }

            System.out.println("Dime la fila que quieras ver: (0-3) "); //El usuario nos pone la segunda cordenada que quiere saber.
            int pfilas2 = sc.nextInt();
            System.out.println("Dime la columna que quieres ver: (0-3) ");
            int pcolum2 = sc.nextInt();
            if (pfilas2 > 3 || pcolum2 > 3) {
                System.out.println("Introduce un valor que este entre el 0 y el 3");
                intentosRestan--;
                continue;
            }
            if (matrizVisible[pfilas2][pcolum2]) {
                System.out.println("Esta casilla ya existe");
                matrizVisible[pfilas1][pcolum1] = false;
            } else {
                matrizVisible[pfilas2][pcolum2] = true;
                printVisibleMatrix(matriz, matrizVisible);
            }
            if (matriz[pfilas1][pcolum1] != matriz[pfilas2][pcolum2]) { //Si las cordenadas que has introducido no coincide, te muestra un mensaje y se vuelve a ocultar.
                System.out.println("No coinciden ninguna letra");
                matrizVisible[pfilas1][pcolum1] = false;
                matrizVisible[pfilas2][pcolum2] = false;
                intentosRestan--;
            } else {
                System.out.println("Todas las letras que has introducido coinciden");
            }


        }

        if (checkFinished(matrizVisible)) { //Si todas las matriz es visible completamente, te sale un mensaje de victoria.
            System.out.println("¡Enhorabuena! Has ganado");
        } else {
            System.out.println("¡Vaya! Has perdido. Vuelve a jugar otra vez.");
        }
    }

    private static void printMatrix(char[][] matriz) { //Es un método que te imprime la matriz.
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void printVisibleMatrix(char[][] matriz, boolean[][] matrizVisible) { //Es un método que lo que hace que te muestre la matriz y si no te lo oculta.
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

    public static void fillMatrix(char[][] matriz) { //Es un método que lo que hace que se imprima las letras.
        char le = 'A'; // le es letra
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = le;
                le++;
                if (le > 'A' + TAM * TAM / 2) {
                    le = 'A';
                }
            }
        }

    }

    private static void randomizeMatrix(char[][] matriz) { //Es un método que lo que hace es que me genere aleatoriamente la matriz.
        char guardadoTempo; //Guardo temporalmente el valor, cuando valla a hacer intercambios.
        int a, b; // a es la fila y b es la columna.
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                a = (int) (Math.random() * matriz.length); // Le da un valor aleatorio a la letra a.
                b = (int) (Math.random() * matriz.length); // Le da un valor aleatorio a la letra b.
                guardadoTempo = matriz[i][j]; // Cogemos la matriz con sus columnas y filas, lo que se conlleva que se guarde en el valor(guardadotempo).
                matriz[i][j] = matriz[a][b]; // Sobreescribe el valor [i][j], con el valor [a][b], ya que son una posición aleatoria.
                matriz[a][b] = guardadoTempo; // Las pociones aleatoia recibe el valor (guardadotempo).
            }
        }
    }

    private static void ocultarTodaLaMatriz(boolean[][] matrizVisible) { //Este método lo que hace es que me oculta toda la matriz visible.
        for (int i = 0; i < matrizVisible.length; i++) {
            for (int j = 0; j < matrizVisible[0].length; j++) {
                matrizVisible[i][j] = false;
            }
        }
    }

    private static boolean checkFinished(boolean[][] matrizVisible) { //Este método lo que hace cuando la matriz no es visible totalmente, aún sigue el juego, pero cuando es visible toda matriz, te sale el mensaje que has ganado.
        for (int i = 0; i < matrizVisible.length; i++) {
            for (int j = 0; j < matrizVisible[0].length; j++) {
                if (!matrizVisible[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

}
