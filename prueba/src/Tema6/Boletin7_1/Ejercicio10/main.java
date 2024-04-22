package Tema6.Boletin7_1.Ejercicio10;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class main {
    public static void main(String[] args) {
        Path ficherOring = Paths.get("./prueba/src/Tema6/Boletin7_1/Ejercicio10/fichero.txt");
        Path directorioDesti = Paths.get("./prueba/src/Tema6/Boletin7_1/Ejercicio10/");
        Pattern patron = Pattern.compile("^F\\s(\\p{L}{3,}\\.\\p{L}{3})$");
        AtomicBoolean correcto = new AtomicBoolean(true);

        try (Stream<String> lineas = Files.lines(ficherOring)) {

            lineas.forEach(linea -> {
                Matcher matcher = patron.matcher(linea);
                if (matcher.matches()){
                        try {
                            Files.createFile(directorioDesti.resolve(matcher.group(1)));
                            System.out.println("Se ha creado el fichero " + matcher.group(1));
                        } catch (FileAlreadyExistsException e) {
                            System.out.println("Ya existe el fichero " + matcher.group(1));
                        } catch (IOException e) {
                            System.out.println("No se puede crear el fichero " + matcher.group(1));
                        }
                }else {
                    correcto.set(false);
                }
            });

        } catch (IOException e) {

            throw new RuntimeException(e);
        }
        if (correcto.get()){
            System.out.println("El fichero es correcto");
        }else {
            System.out.println("Al menos una linea del fichero no es correcta.");
        }
    }
}
