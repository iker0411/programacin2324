package Tema6.Boletin7_1.Ejercicio11;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Pattern;

public class main {
    public static void main(String[] args) {
        Path fichero = Paths.get("./prueba/src/Tema6/Boletin7_1/Ejercicio11/fichero.txt");
        Pattern patron = Pattern.compile("(\\p{Lu}{2,})\\s(\\p{Lu}{2,})\\s(\\p{Lu}{2,})\\s([^\\\\/;\"\\*\\?|<>])");
    }
}
