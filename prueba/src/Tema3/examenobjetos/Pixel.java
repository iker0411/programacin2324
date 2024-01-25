package Tema3.examenobjetos;

public class Pixel {
    private int rojo, azul,verder;
    private boolean defecturoso;

    public Pixel(boolean defecturoso) {
        this.defecturoso = defecturoso;
    }

    public int getRojo() {
        return rojo;
    }

    public void setRojo(int rojo) {
        this.rojo = rojo;
    }

    public int getAzul() {
        return azul;
    }

    public void setAzul(int azul) {
        this.azul = azul;
    }

    public int getVerder() {
        return verder;
    }

    public void setVerder(int verder) {
        this.verder = verder;
    }

    public boolean isDefecturoso() {
        return defecturoso;
    }
}
