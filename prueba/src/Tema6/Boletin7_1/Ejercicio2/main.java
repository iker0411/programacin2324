package Tema6.Boletin7_1.Ejercicio2;

import java.io.*;

public class main {
    public static void main(String[] args) {
        File archivoNuevo = new File(".\\src\\Tema6\\Boletin7_1\\Ejercicio1\\FicheroNuevo.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(archivoNuevo))) {
           String lineas;
           StringBuilder acum = new StringBuilder();
            while ((lineas = br.readLine()) != null){
                acum.append(lineas);
            }
            System.out.println("El contenido del fichero es " + acum);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
