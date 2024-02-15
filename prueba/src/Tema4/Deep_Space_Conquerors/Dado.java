package Tema4.Deep_Space_Conquerors;

import java.util.Random;

public class Dado implements ILanzable {
    private int numCaras;
    private int puntuacionMinima;
    private Random random;

    public Dado(int numCaras, int puntuacionMinima) {
        numCaras = numCaras;
        puntuacionMinima = puntuacionMinima;
        random = new Random();
    }

    @Override
    public int lanza() {
        return 0;//NO SE COMO
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
