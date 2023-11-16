package Tema2.Arrays;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio6 {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Random ra = new Random();

      System.out.println("Dime el tamaño de array:");
      int tamaño = sc.nextInt();

      int[] array = new int[tamaño];
      for (int i = 0; i < tamaño; i++) {
          array[i] = ra.nextInt(50);
      }

      System.out.println("Array generado: ");
      for (int num : array){
          System.out.println(num + " ");
      }

      System.out.print("\nDime el elemento que buscas: ");
      int elementoBuscar = sc.nextInt();


      boolean encontrado = false;
      for (int num : array) {
          if (num == elementoBuscar) {
              encontrado = true;
              break;
          }
      }
      if (encontrado) {
          System.out.println("El elemento " + elementoBuscar + " se encuentra en el array.");
      } else {
          System.out.println("El elemento " + elementoBuscar + " no se encuentra en el array.");
      }
      sc.close();
  }
}