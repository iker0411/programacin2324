package Tema4.Boletin5_1_3;

public class Personaje {
    public static final int FUERZA_MAX = 20;
    public static final int INTELIGENCIA_MAX = 20;
    public static final int VIDA_MAX = 100;

    private String nombre;
    private TRaza raza;
    private int fuerza;
    private int inteligencia;
    private int vidaMaxima;
    private int vidaActual;

    public Personaje(String nombre, TRaza raza, int fuerza, int inteligencia, int vidaMaxima) throws PersonajeException {
        this.nombre = nombre;
        this.raza = raza;
        setFuerza(fuerza);
        setInteligencia(inteligencia);
        setVidaMaxima(vidaMaxima);
        setVidaActual(vidaMaxima);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFuerza(int fuerza) throws PersonajeException {
        if (this.fuerza < 0 || this.fuerza > FUERZA_MAX){
            throw new PersonajeException("Valor de fuerza no permitido");
        }
        this.fuerza = fuerza;
    }

    public void setInteligencia(int inteligencia) throws PersonajeException {
        if (this.inteligencia < 0 || this.inteligencia > INTELIGENCIA_MAX){
            throw new PersonajeException("Valor de inteligencia no permitido");
        }
        this.inteligencia = inteligencia;
    }

    public void setVidaMaxima(int vidaMaxima) throws PersonajeException {
        if (this.vidaMaxima < 0 || this.vidaMaxima > VIDA_MAX){
            throw new PersonajeException("Valor de vida no permitido");
        }
        this.vidaMaxima = vidaMaxima;
    }

    public void setVidaActual(int vidaActual) throws PersonajeException {
        if (this.vidaActual < 0 || this.vidaActual > vidaMaxima){
            throw new PersonajeException("Valor de vida no permitido");
        }
        this.vidaActual = vidaActual;
    }

    public String getNombre() {
        return nombre;
    }

    public TRaza getRaza() {
        return raza;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public int getVidaActual() {
        return vidaActual;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", raza=" + raza +
                ", fuerza=" + fuerza +
                ", inteligencia=" + inteligencia +
                ", vidaMaxima=" + vidaMaxima +
                ", vidaActual=" + vidaActual +
                '}';
    }
}
