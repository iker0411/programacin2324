package Tema6.Boletin7_1.Ejercicio5;

import Tema5.Practica_No_Evaluable_Recetas_de_Cocina.MIEntradaSalida2_0;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class main {
    public static void main(String[] args) {
       int opcion;
        do {
            menu();
             opcion = MIEntradaSalida2_0.leerEnteroDeRango("Elije una opción", 1, 5);
              switch (opcion) {
                  case 1:
                      crearDirectorio();
                      break;
                  case 2:
                      crearFichero();
                      break;
              }
        }while (opcion != 5);
    }
    public static void menu(){
        System.out.println("""
                1.Crear directorio
                2.Crear fichero de texto
                3.Borrar fichero de texto
                4.Mostrar los ficheros que contiene una carpeta
                5.Salir.
                """);
    }
    public static void crearDirectorio(){
        String nombre = MIEntradaSalida2_0.leerCadena("Diga el nombre del directorio");
        File directorio = new File("./prueba/src/Tema6/Boletin7_1/Ejercicio5/"+nombre);
        if (directorio.exists()){
            System.out.println("El directorio ya existe");
        }else {
            if (directorio.mkdir()){
                System.out.println("El directorio se ha creado correctamente");
            }else {
                System.out.println("El directorio no se ha creado correctamente");
            }
        }
    }
    public static void crearFichero(){
        String nombre = MIEntradaSalida2_0.leerCadena("Elija el nombre del fichero");
        File fichero = new File("./prueba/src/Tema6/Boletin7_1/Ejercicio5/" + nombre);
        boolean append = true;
        if (fichero.exists()){
            if (fichero.isFile()){
                append = MIEntradaSalida2_0.leerSN("¿Quieres anadir el contenido al final del fichero?") == 'S';
            }else {
                System.out.println("El fichero no ha podido crearse, porque ya esxite un fichero o un directorio");
                return;
            }
        }
        String cadena  = MIEntradaSalida2_0.leerCadena("Escriba la cadena que estará en el fichero");

        try(PrintWriter pw = new PrintWriter(new FileWriter(fichero, append))) {
            pw.println(cadena);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
    public static void borrarFichero(){
        String nombre = MIEntradaSalida2_0.leerCadena("Elija el nombre del fichero que quiera borrar");
        File ficheroBorrar = new File("./prueba/src/Tema6/Boletin7_1/Ejercicio5/" + nombre);
        if ()
    }
}
