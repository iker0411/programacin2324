package Tema6.Boletin7_1.Ejercicio8;


import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class main {
    public static void main(String[] args) {
        Path path = Paths.get(".\\prueba\\src\\Tema6\\Boletin7_1\\Ejercicio8\\Prueba.txt");

        Pattern p = Pattern.compile("((?:\\p{L}{2,}\\s){3,})(([1-9][0-9]?)|0[1-9])");

        try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            if (reader.lines().map(p::matcher).allMatch(Matcher::matches)) {
                System.out.println("El fichero es valido");
            } else {
                System.out.println("El ficheor no es valido");
            }
        } catch (IOException e) {
            System.out.println("El fichero no se ha podido abrir o no existe");
        }
    }
}
