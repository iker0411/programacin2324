package Tema6.Boletin7_1.Ejercicio7;

import Tema5.Practica_No_Evaluable_Recetas_de_Cocina.MIEntradaSalida2_0;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class main {
    static File directorio = new File("/Users/Alumno/Desktop");

    public static void main(String[] args) {
        int opcion;
        do {
            menu();
            opcion = MIEntradaSalida2_0.leerEnteroDeRango("Elije una opción", 1, 5);
            switch (opcion) {
                case 1:
                    listarPorComienzo();
                    break;
                case 2:
                    listarPorExtension();
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

            }
        } while (opcion != 5);
    }

    public static void menu() {
        System.out.println("""
                1) Listar por comienzo:
                2) Listar por extensión:
                3) Buscar por archivos:
                4) Buscar recursivo:
                5) Salir:
                """);

    }
    //io

    public static void listarPorComienzo() {
        String palabraFiltrar = MIEntradaSalida2_0.leerCadena("Elija la palabra por la Que filtrar el fichero");
        File[] files = directorio.listFiles((dir, name) -> name.startsWith(palabraFiltrar));

        for (File file : files) {
            if (file.isDirectory()) {
                System.out.println(file.getName() + "(directorio)");
            } else {
                System.out.println(file.getName() + " - " + file.length() / 1024 + "KB");
            }
        }
    }

    //nio
    public static void listarPorExtension() {
        String palabraFiltrar = MIEntradaSalida2_0.leerCadena("Elija la extension del fichero a buscar");
        Path directorio = Paths.get("/Users/Alumno/Desktop");

        try (Stream<Path> ficheros = Files.list(directorio)) {
            ficheros.filter(Files::isRegularFile)
                    .filter(a -> a.toString().endsWith("." + palabraFiltrar))
                    .forEach(a -> {
                        try {
                            System.out.println(a.getFileName().toString() + " - " + Files.size(a) / 1024 + " KB");
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
        } catch (IOException e) {
            System.out.println("Ocurrio un error al acceder al fichero");
        }
    }
}
