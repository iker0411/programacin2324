package Tema4.Boletin5_1_3;

public class Personaje {
    public static final int FUERZA_MAXIMA=20;
    public static final int INTELIGENCIA_MAXIMA=20;
    public static final int VIDA_MAXIMA=100;
    public static final int FUERZA_MIN=0;
    public static final int INTELIGENCIA_MIN=0;
    public static final int VIDA_MIN=0;
    private String nombre;
    private TRaza razas;
    private int fuerza;
    private int inteligencia;
    private int vidaMaxima;
    private int vidaActual;

    public Personaje(String nombre, TRaza razas, int fuerza, int inteligencia, int vidaMaxima) throws PersonajeException {
        this.nombre = nombre;
        this.razas = razas;
        setFuerza(fuerza);
        setInteligencia(inteligencia);
        setVidaMaxima(vidaMaxima);
        setVidaActual(vidaMaxima);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) throws PersonajeException {
        if(fuerza < FUERZA_MIN || fuerza > FUERZA_MAXIMA){
            throw new PersonajeException("Valor de fuerza no permitido");
        }
        this.fuerza = fuerza;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) throws PersonajeException {
        if (inteligencia < INTELIGENCIA_MIN || inteligencia > INTELIGENCIA_MAXIMA){
            throw new PersonajeException("Valor de inteligencia no permitido");
        }
        this.inteligencia = inteligencia;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public void setVidaMaxima(int vidaMaxima) throws PersonajeException {
        if (vidaMaxima < VIDA_MIN || vidaMaxima > VIDA_MAXIMA){
            throw new PersonajeException("Valor de vida no permitido");
        }
        this.vidaMaxima = vidaMaxima;
    }

    public int getVidaActual() {
        return vidaActual;
    }

    public void setVidaActual(int vidaActual) throws PersonajeException {
        if (vidaActual < VIDA_MIN ){
            this.vidaActual = VIDA_MIN;
        } else if (vidaActual > vidaMaxima) {
            this.vidaActual = vidaMaxima;
        }else {
            this.vidaActual = vidaActual;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Personaje{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", razas=").append(razas);
        sb.append(", fuerza=").append(fuerza);
        sb.append(", inteligencia=").append(inteligencia);
        sb.append(", vidaMaxima=").append(vidaMaxima);
        sb.append(", vidaActual=").append(vidaActual);
        sb.append('}');
        return sb.toString();
    }
}
