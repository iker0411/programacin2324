package Tema4.Examen_21_22;

public class Ficherotexto extends Fichero implements Convertible{
    private String[] parrafos;

    public Ficherotexto(String nombre, String[] parrafos) {
        super(nombre);
        this.parrafos = parrafos;
    }

    //cada caracter suponemos que ocupa un byte
    public long getSize(){
        long acum = 0;
        for (int i =0; i < parrafos.length; i++){
            acum += parrafos[i] == null ? 0 : parrafos[i].length();
        }
        return acum;
    }

    public String[] getParrafos() {
        return parrafos;
    }

    @Override
    public String convertir() {
        StringBuilder guardar = new StringBuilder();
        for (int i =0; i < parrafos.length; i++){
            if (parrafos[i] != null){
                guardar.append(parrafos[i]);
            }
        }
        return guardar.toString();
    }
}
