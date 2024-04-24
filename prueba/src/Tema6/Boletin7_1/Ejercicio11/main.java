package Tema6.Boletin7_1.Ejercicio11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class main {
    public static void main(String[] args) {
        Path fichero = Paths.get("./prueba/src/Tema6/Boletin7_1/Ejercicio11/fichero.txt");
        Pattern patron = Pattern.compile("(\\p{Lu}{2,})\\s(\\p{Lu}{2,})\\s(\\p{Lu}{2,})\\s([^\\\\\\\\/:\\\"*?<>|\\n]{2,})");
        String directorio = "./prueba/src/Tema6/Boletin7_1/Ejercicio11/pruebaEj11";
        try (Stream<String> lineas = Files.lines(fichero)){
            lineas.map(patron::matcher)
                    .filter(Matcher::matches)
                    .forEach(matcher -> {
                       String nombreAlum = matcher.group(2) + matcher.group(3) + matcher.group(1);
                        try {
                            Files.createDirectories(Path.of(directorio, matcher.group(4), nombreAlum));
                        } catch (IOException e) {
                            System.out.println(e);
                        }
                    });
        } catch (IOException e) {
            System.out.println("Fichero no encontrado");
        }


    }

}
