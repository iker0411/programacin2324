package Tema4.examen2324.model;

import Tema4.examen2324.enums.WeatherCondition;
import Tema4.examen2324.exceptions.MuerteException;
import Tema4.examen2324.exceptions.RoundStartException;
import Tema4.examen2324.exceptions.ValorNoValidoException;
import Tema4.examen2324.interfaces.Atacable;
import Tema4.examen2324.interfaces.IAtacador;

public class PokemonAgua extends Pokemon implements Atacable{

    private static final int MIN_HIDRATACION = 10;
    private static final int MAX_HIDRATACION = 20;
    private int hidratacion;
    private double precisionPorLluvia;

    public PokemonAgua(String nombre, int puntoSalud, int ataque, int defensa, int hidratacion) throws ValorNoValidoException {
        super(nombre, puntoSalud, ataque, defensa);
        this.hidratacion = hidratacion;
        precisionPorLluvia = 1f;
    }

    public void setHidratacion(int hidratacion) throws ValorNoValidoException {
        if (hidratacion < MIN_HIDRATACION || hidratacion > MAX_HIDRATACION) {
            throw new ValorNoValidoException("Hidratacion debe estar entre " + MIN_HIDRATACION + " y " + MAX_HIDRATACION);
        }
        this.hidratacion = hidratacion;
    }

    @Override
    public void atacar(Atacable objetivo, WeatherCondition tiempo) throws MuerteException {
        objetivo.recibirAtaque(tiempo,(int) (getAtaque() * precisionPorLluvia), this);
    }

    @Override
    public void roundStart(WeatherCondition tiempo) throws RoundStartException {
       if (!estaVivo()){
           return;
       }
        if (tiempo == WeatherCondition.LLUVIA) {
            setPuntosSalud(getPuntosSalud() + hidratacion);
            precisionPorLluvia += Math.random();
            throw  new RoundStartException("El pokémon " + getNombre() + "recibe una curación por lluvia y  ");
        }
        else {
            precisionPorLluvia = 1d;
        }
    }

    @Override
    public void recibirAtaque(WeatherCondition tiempo, int puntosAtaque, IAtacador atacador) throws MuerteException {
        setPuntosSalud(getPuntosSalud() - puntosAtaque * (1 - getDefensa()/100));
        if (!estaVivo()){
            throw new MuerteException("El pokémon " + getNombre() + " nos ha dejado");
        }
    }
}
