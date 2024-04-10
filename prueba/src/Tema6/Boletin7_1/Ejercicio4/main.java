package Tema6.Boletin7_1.Ejercicio4;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class main {
    public static void main(String[] args) {
        Path file = Paths.get("./prueba/src/Tema6/Boletin7_1/Ejercicio4/ejer4.txt");
        try(BufferedReader indata = new BufferedReader(new InputStreamReader(System.in))) {
            String data;
            while (!(data = indata.readLine()).equals("fin")) {
                Files.writeString(file, data, StandardOpenOption.APPEND);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
