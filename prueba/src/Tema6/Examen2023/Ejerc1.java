package Tema6.Examen2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class Ejerc1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la carpeta origen");
        Path origen = Paths.get(sc.nextLine());
        System.out.println(("Introduce la carpeta destino"));
        Path destino = Paths.get(sc.nextLine());

        if (!Files.isDirectory(origen)){
            System.out.println("La ruta origen no es un directorio valido");
            return;
        }else{
            if (!Files.isReadable(origen)){
                System.out.println("El directorio origen no tiene permisos de lectura");
            }
        }
        if (!Files.isDirectory(destino)){
            System.out.println("La ruta destino no es un directorio valido");
            return;
        }else {
            if (!Files.isWritable(destino)){
                System.out.println("La ruta destino no tiene permiso de escritura");
            }
        }
        try (Stream<Path> st = Files.list(origen)){
            st.filter(p -> {
                try {
                    if (Files.size(p)  > 1024 && Files.isRegularFile(p) && p.getFileName().endsWith(".txt")){
                         try (BufferedReader br = Files.newBufferedReader(p)){
                            if (br.readLine().toLowerCase().startsWith("copiar")){
                                return true;
                            }
                         }
                    }
                    return false;

                } catch (IOException e) {
                    System.out.println("Error al leer el fichero");
                }
                return false;
            }).forEach(path -> {
                try {
                    Files.copy(path, destino.resolve(path.getFileName()));
                } catch (IOException e) {
                    System.out.println("Error al copiar el fichero: " + path.getFileName());;
                }
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
