package Tema4.Deep_Space_Conquerors;

import java.util.Random;

public class Dado implements ILanzable {
    private int numCaras;
    private int puntuacionMinima;
    private Random random;

    public Dado(int numCaras, int puntuacionMinima) {
        if (numCaras < 4){
            throw new IllegalArgumentException("El numero mínimo de caras del dado dedbe ser 4");
        }
        numCaras = numCaras;
        puntuacionMinima = puntuacionMinima;

    }

    @Override
    public int lanza() {

    }

    @Override
    public int getMin() {
        return puntuacionMinima;
    }

    @Override
    public int getMax() {
        return numCaras;
    }
}
