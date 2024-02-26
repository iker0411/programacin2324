package Tema4.examen2324.model;

import Tema4.examen2324.exceptions.ValorNoValidoException;

import javax.swing.plaf.PanelUI;

public class PokemonFuego extends Pokemon {

    public static final int MIN_RESISTENCIA_AGUA = 5;

    public static final int MAX_RESISTENCIA_AGUA = 10;
    private int reistenciAlAgua;
    public PokemonFuego(String nombre, int puntoSalud, int ataque, int defensa, int reistenciAlAgua) throws ValorNoValidoException {
        super(nombre, puntoSalud, ataque, defensa);
    }

    public void setReistenciAlAgua(int reistenciAlAgua){
        if (reistenciAlAgua < MIN_RESISTENCIA_AGUA || reistenciAlAgua > MAX_RESISTENCIA_AGUA ){
            throw new ValorNoValidoException("EL valor de")
        }
    }
}
