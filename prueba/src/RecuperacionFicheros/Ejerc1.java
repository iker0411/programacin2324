package RecuperacionFicheros;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Ejerc1 {
    public static void main(String[] args) {
        Path file = Paths.get("prueba/src/RecuperacionFicheros/ej1.txt");
        try (Stream<String> lineas = Files.lines(file)){
             lineas.forEach( l->{
                 System.out.printf("%d: %s\n", l.split(" ").length, l);
             });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
