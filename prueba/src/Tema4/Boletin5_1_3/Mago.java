package Tema4.Boletin5_1_3;

import java.util.Arrays;

public class Mago extends Personaje {
    public static final int HECHIZOS_MAX=4;
    public static final int INTELIGENCIA_MIN_MAGO=17;
    public static final int FUERZA_MAX_MAGO=15;
    public static final int DAMAGE_HECHIZO=10;

    private String[] hechizos;

    public Mago(String nombre, TRaza razas, int fuerza, int inteligencia, int vidaMaxima) throws PersonajeException {
        super(nombre, razas, fuerza, inteligencia, vidaMaxima);
        hechizos = new String[HECHIZOS_MAX];
    }

    @Override
    public void setFuerza(int fuerza) throws PersonajeException {
        if(fuerza > FUERZA_MAX_MAGO){
            throw new PersonajeException("Valor de fuerza no permitido");
        }
        super.setFuerza(fuerza);
    }

    @Override
    public void setInteligencia(int inteligencia) throws PersonajeException {
        if(inteligencia < INTELIGENCIA_MIN_MAGO){
            throw new PersonajeException("Valor de inteligencia no permitido");
        }
        super.setInteligencia(inteligencia);
    }

    public void aprendeHechizo(String hechizo) throws PersonajeException {

        boolean encontrado = false;
        int posVacia=-1;

        for (int i = 0; i < hechizos.length && !encontrado ; i++){
            if (hechizo.equals(hechizos[i])){
                encontrado = true;
            }
            if (hechizos[i] == null && posVacia == -1){
                posVacia = i;
            }
        }
        if(encontrado){
            throw new PersonajeException("El mago no puede aprender el mismo hechizo varias veces");
        }
        if (posVacia == -1){
            throw new PersonajeException("El mago ya ha aprendido todos los hechizos posibles");
        }
        hechizos[posVacia]= hechizo;
    }

    public void lanzaHechizo(Personaje personaje, String hechizo) throws PersonajeException {
        int posHechizo = -1;

        for (int i = 0; i < hechizos.length && posHechizo == -1; i++){
            if(hechizo.equals(hechizos[i])){
                posHechizo = i;
            }
        }
        if (posHechizo == -1){
            throw new PersonajeException("El mago no conoce ese hechizo");
        }
        if (this == personaje){
            throw new PersonajeException("No puedes atacarte a ti mismo");
        }
        if (personaje.getVidaActual() == 0){
            throw new PersonajeException("El otro personaje ha muerto");
        }
        hechizos[posHechizo] = null;
        personaje.setVidaActual(personaje.getVidaActual()-DAMAGE_HECHIZO);

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Mago{");
        sb.append("hechizos=").append(Arrays.toString(hechizos));
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}

