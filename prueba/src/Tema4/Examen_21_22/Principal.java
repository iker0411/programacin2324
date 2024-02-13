package Tema4.Examen_21_22;

import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        Random rn = new Random();
        Fichero fBinario = new FicheroBinario("Fichero Binario", generarArrayBytesRandom(rn.nextInt(1,30)));
        Fichero fAudio = new FicheroAudio("Fichero Audio", generarArrayBytesRandom(rn.nextInt(1,30)), rn.nextInt(1,30));
        Fichero fVideo = new FicheroVideo("Fichero Video", generarArrayBytesRandom(rn.nextInt(1,30)), rn.nextInt(1, 30));
        Fichero fImagen = new FicheroImagen("Fichero Imagen", generarArrayBytesRandom(rn.nextInt(1, 30)), TFormato.JPEG);
        Fichero fEjecutable = new FicheroEjecutable("Fichero Ejecutable", generarArrayBytesRandom(rn.nextInt(1,30)), rn.nextInt(1, 30));
        Fichero fTextoPlano = new FicheroTextoPlano("Fichero texto plano", generateRandomStringArray(rn.nextInt(1, 30)));
        Fichero fTextoFormateado = new FicheroTextoFormateado("Fichero texto formateado", generateRandomStringArray(rn.nextInt(1, 30)),"arial", rn.nextInt(), "rojo");

        Fichero[] fichero = {fBinario, fAudio, fVideo, fImagen, fEjecutable, fTextoPlano, fTextoFormateado};

        for (int i = 0 ; i < fichero.length; i++){
            if (fichero[i] instanceof Analizable){
                System.out.println(((Analizable) fichero[i]).analizar());
            }
            if (fichero[i] instanceof  Convertible) {
                System.out.println(((Convertible) fichero[i]).convertir());
            }
            if (fichero[i] instanceof  Reproducible){
                System.out.println(((Reproducible) fichero[i]).reproducir());
            }
            if (fichero[i] instanceof Representable){
                ((Representable) fichero[i]).representar();
            }

        }
    }
    public static byte[] generarArrayBytesRandom(int size){
        Random r = new Random();

        byte[] array = new byte[size];

        r.nextBytes(array);

        return array;
    }
    public static String[] generateRandomStringArray(int size) {
        String[] randomStrings = new String[size];
        Random random = new Random();
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        for (int i = 0; i < size; i++) {
            StringBuilder sb = new StringBuilder();
            int length = random.nextInt(10) + 1;
            for (int j = 0; j < length; j++) {
                int index = random.nextInt(chars.length());
                sb.append(chars.charAt(index));
            }
            randomStrings[i] = sb.toString();
        }
        return randomStrings;
    }
}
