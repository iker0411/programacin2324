package Tema4.Boletin5_1_3;

public class Mago extends Personaje {
    private String[] hechizos;
    public static final int CAPACIDAD_HECHIZO = 4;
    public static final int INTELIGENCIA_MIN_MAGO = 17;
    public static final int FUERZA_MAX_MAGO = 15;

    public Mago(String nombre, TRaza raza, int fuerza, int inteligencia, int vidaMaxima, String[] hechizos) throws PersonajeException {
        super(nombre, raza, fuerza, inteligencia, vidaMaxima);
        hechizos = new String[CAPACIDAD_HECHIZO];
    }

    @Override
    public void setFuerza(int fuerza) throws PersonajeException {
        if (fuerza > FUERZA_MAX_MAGO) {
            throw new PersonajeException("Valor de fuerza no permitido para ser MAGO");
        }
        super.setFuerza(fuerza);
    }

    @Override
    public void setInteligencia(int inteligencia) throws PersonajeException {
        if (inteligencia < INTELIGENCIA_MIN_MAGO) {
            throw new PersonajeException("Valor de inteligencia no permitido para ser MAGO");
        }
        super.setInteligencia(inteligencia);
    }

    public void aprendeHechizo(String hechizo) throws PersonajeException {
        boolean loTengo = false;
        int posVacia = -1;
        for (int i = 0; i < hechizos.length && !loTengo; i++) {
            if (hechizo.equals(hechizos[i])) {
                loTengo = true;
            }
            if (hechizos[i] == null && posVacia == -1) {
                posVacia = i;
            }
        }
        if (!loTengo && posVacia != -1) {
            hechizos[posVacia] = hechizo;
        }
        if (loTengo){
            throw new PersonajeException("El mago no puede aprender dos veces el mismo hechizo");
        }
        if (posVacia== -1){
            throw new PersonajeException("No tiene espacio suficiente para más hechizos");
        }
        hechizos[posVacia]=hechizo;
    }
    public void lanzaHechizo(Personaje personaje, String hechizo)throws PersonajeException{
        int posHechizo=-1;
        for (int i = 0; i < hechizos.length && posHechizo==-1; i++) {
            if (hechizo.equals(hechizos[i])) {
                posHechizo=i;
            }

        }
        if(posHechizo==-1){
            throw new PersonajeException("El mago no conoce el hechizo");
        }
        if (this==personaje){
            throw new PersonajeException("No puedes atacarte a ti mismo");
        }

        if (personaje.getVidaActual()==0){
            throw new PersonajeException("El personaje esta muerto");
        }


    }

}

