package Tema6.Boletin7_1.Ejercicio1;

import java.io.*;

public class main {
    public static void main(String[] args) {

        File archivoNuevo = new File(".\\prueba\\src\\Tema6\\Boletin7_1\\Tema6.XML.Ejercicio1\\FicheroNuevo.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(archivoNuevo))) {
            int cont = 0;
            while ((br.readLine()) != null){
                cont++;
            }
            System.out.println("El fichero tenia estas lineas " + cont);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}