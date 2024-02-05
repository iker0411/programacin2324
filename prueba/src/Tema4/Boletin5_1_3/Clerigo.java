package Tema4.Boletin5_1_3;

public class Clerigo extends Personaje {
    public static final int STR_MIN = 18;
    public static final int INT_MIN = 12;
    public static final int INT_MAX = 16;
    public static final int CURACION = 10;
    private final String dios;

    public Clerigo(String nombre, TRaza razas, int fuerza, int inteligencia, int vidaMaxima, String dios) throws PersonajeException {
        super(nombre, razas, fuerza, inteligencia, vidaMaxima);
        this.dios = dios;
    }

    public String getDios() {
        return dios;
    }

    public void curar(Personaje personaje) throws PersonajeException {
        if (this == personaje){
            throw new PersonajeException("No puedes curarte a ti mismo");
        }
        if (personaje.getVidaActual() == VIDA_MIN){
            throw new PersonajeException("No puedes curar a un personaje muerto");
        }
        personaje.setVidaActual(personaje.getVidaActual()+CURACION);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Clerigo{");
        sb.append("dios='").append(dios).append('\'');
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }

}
