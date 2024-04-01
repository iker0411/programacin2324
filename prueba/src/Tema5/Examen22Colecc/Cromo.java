package Tema5.Examen22Colecc;

public abstract class Cromo {
    private String id;

    public Cromo(String id) {
        this.id = id;
    }

    public abstract String getNombre();

    public abstract String getEquipo();
}
