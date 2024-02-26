package Tema4.examen2324.model;

import Tema4.examen2324.enums.WeatherCondition;
import Tema4.examen2324.exceptions.RoundStartException;
import Tema4.examen2324.exceptions.ValorNoValidoException;
import Tema4.examen2324.interfaces.IAtacador;

public abstract class Pokemon implements IAtacador {

    public static final int MAX_SALUD = 100;
    public static final int MIN_ATAQUE = 5;
    public static final int MAX_ATAQUE = 15;
    public static final int MIN_DEFENSA = 5;
    public static final int MAX_DEFENSA = 25;

    private int PuntosSalud;
    private int ataque;
    private int defensa;
    private String nombre;

    public Pokemon(String nombre, int puntoSalud, int ataque, int defensa) throws ValorNoValidoException {
        setPuntosSalud(puntoSalud);
        setAtaque(ataque);
        setDefensa(defensa);
        this.PuntosSalud = puntoSalud;
        this.ataque = ataque;
        this.defensa = defensa;
        this.nombre = nombre;
    }

    public int getPuntosSalud() {
        return PuntosSalud;
    }

    public void setPuntosSalud(int puntosSalud) {
        if (puntosSalud < 0) {
            puntosSalud = 0;
        } else if (puntosSalud > MAX_SALUD) {
            puntosSalud = MAX_SALUD;
        }
        PuntosSalud = puntosSalud;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) throws ValorNoValidoException {
        if (ataque < MIN_ATAQUE || ataque > MAX_ATAQUE) {
            throw new ValorNoValidoException("El valor de ataque debe estar entre " + MIN_ATAQUE + " Y " + MAX_ATAQUE);
        }

        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) throws ValorNoValidoException {
        if (defensa < MIN_DEFENSA || defensa > MAX_DEFENSA) {
            throw new ValorNoValidoException("El valor de defensa debe estar entre " + MIN_DEFENSA + " Y " + MAX_DEFENSA);
        }
        this.defensa = defensa;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract void roundStart(WeatherCondition tiempo) throws RoundStartException;

    public boolean estaVivo() {
        return PuntosSalud > 0;
    }
}
