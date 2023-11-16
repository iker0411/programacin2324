package Tema2.Arrays;

import Boletin1_1.MientradaSalida;

import java.util.Arrays;


public class pila_Eje13 {
    public static final int TAM_PILA = 5;
    public static int[] pila = new int[TAM_PILA];

    public static int  ultimoElemento = 0;

    public static void main(String[] args) {
        int opcion = 0;

        while (opcion != 3) {
            menu();
            opcion = MientradaSalida.leerEnteroDeRango("Introduce una opción", 1, 3);

            switch (opcion) {
                case 1 -> {
                    int num = MientradaSalida.leerEntero("Introduce un número");
                    apilar(num);
                }
                case 2 -> {
                    int numDesapilado = desapilar();
                    System.out.println("Has desapilado el número " + numDesapilado);
                }
                case 3 -> System.out.println("Adiós");
                default -> System.out.println("Elige una opción válida");
            }
        }

    }
    public static void apilar(int num){
        if (ultimoElemento!=pila.length){
            pila[ultimoElemento]=num;
            ultimoElemento++;
        }else {
            System.out.println("No hay espacio. Libere en caso de que quieras agregar otro valor");
        }
    }
    public static int desapilar(){
        if (ultimoElemento==0){
            System.out.println("No hay nada que desapilar");


        }else {
            ultimoElemento--;
        }
        return pila[ultimoElemento];
    }
    public static void mostrarPila(){
        System.out.println(Arrays.toString(pila));
    }
    public static void menu () {
        System.out.println("¿Qué deseas hacer?");
        System.out.println("1) Apilar");
        System.out.println("2) Desapilar");
        System.out.println("3) Salir");
    }

}
