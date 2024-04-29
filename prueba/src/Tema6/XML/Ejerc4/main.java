package Tema6.XML.Ejerc4;

import java.io.*;
import java.nio.file.Files;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {
    public static void main(String[] args) {
        File fichero = new File("./prueba/src/Tema6/XML/Ejerc4/quijote.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(fichero)))  {
            String linea;
            String patronRazon = "\\braz[oó]n\\b";
            Pattern pattern = Pattern.compile(patronRazon, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
            int cont = 0;
            while ((linea = br.readLine()) != null ){
                Matcher m = pattern.matcher(linea);
                while (m.find()){
                    cont++;
                }
            }
            System.out.println("La palabra razón se ha encontrado " + cont + " veces");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
