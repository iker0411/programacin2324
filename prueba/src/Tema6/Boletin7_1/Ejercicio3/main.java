package Tema6.Boletin7_1.Ejercicio3;

import java.io.*;

public class main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw = new PrintWriter(new FileWriter("./prueba/src/Tema6/Boletin7_1/Tema6.XML.Ejercicio3/salidaEj3.txt", true))){
            String linea;
            while (!(linea =  br.readLine()).equals("fin")){
                pw.println(linea);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
