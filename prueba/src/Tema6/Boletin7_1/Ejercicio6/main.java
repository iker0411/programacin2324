package Tema6.Boletin7_1.Ejercicio6;

import java.io.File;

public class main {
    public static void main(String[] args) {
        File directorio = new File(".\\prueba\\src\\");
        if (directorio.exists() && directorio.isDirectory()){
            listarArchivosEnDirectorio(directorio);
        }else {
            System.out.println("El directorio no existe o no es valido");
        }
    }
    public static void listarArchivosEnDirectorio(File directorio){
        File[] archivos = directorio.listFiles();

        if (archivos == null || archivos.length == 0){
            System.out.println("El directorio esta vacio");
            return;
        }
        for (File archivo : archivos){
            if ( archivo.isDirectory()){
                System.out.println(archivo.getName() + "(Directorio)");
            }else {
                System.out.println(archivo.getName() + " - " + archivo.length() /1024 +"KB");
            }
        }
    }
}

