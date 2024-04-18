package Tema6.Boletin7_1.Ejercicio9;



import java.io.BufferedWriter;
import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class main {
    //NIO
    public static void main(String[] args) {
        Path path1 = Paths.get("C:\\Users\\Alumno\\Desktop\\programacion2324\\prueba\\src\\Tema6\\Boletin7_1\\Ejercicio9\\matriculas.txt");
        Path path2 = Paths.get("C:\\Users\\Alumno\\Desktop\\programacion2324\\prueba\\src\\Tema6\\Boletin7_1\\Ejercicio9\\matriculasCorrectas.txt");

        Pattern p = Pattern.compile("\\p{L}*\\s(\\d{4}-[A-Z&&[^AEIOU]]{3})");

        try (BufferedWriter writer = Files.newBufferedWriter(path2, StandardOpenOption.TRUNCATE_EXISTING,  StandardOpenOption.CREATE);
             Stream<String> lineas = Files.lines(path1)) {
            lineas.map(p::matcher)
                    .filter(Matcher::matches)
                    .forEach(matcher -> {
                        try {
                            writer.write(matcher.group(1));
                            writer.newLine();
                        } catch (IOException e) {
                            System.out.println("Ha ocurrido un error");
                        }
                    });
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error" + e.getMessage());
        }

    }
}
