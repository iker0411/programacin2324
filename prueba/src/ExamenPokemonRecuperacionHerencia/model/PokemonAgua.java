package ExamenPokemonRecuperacionHerencia.model;

import ExamenPokemonRecuperacionHerencia.enums.WeatherCondition;
import ExamenPokemonRecuperacionHerencia.exceptions.MuerteException;
import ExamenPokemonRecuperacionHerencia.exceptions.PokemonException;
import ExamenPokemonRecuperacionHerencia.exceptions.RoundStartException;
import ExamenPokemonRecuperacionHerencia.interfaces.Atacable;

public class PokemonAgua extends Pokemon implements Atacable {
    private int valorHidratacion;
    private double precionLluvia;

    public PokemonAgua(String nombre, int salud, int ataque, int defensa, int valorHidratacion, double precionLluvia) throws PokemonException {
        super(nombre, salud, ataque, defensa);
        this.valorHidratacion = valorHidratacion;
        this.precionLluvia = precionLluvia;
    }

    @Override
    public void setSalud(int salud) throws PokemonException {
        if (salud > SALUD_MAX ){
            salud = SALUD_MAX;
        }
        super.setSalud(salud);
    }



    @Override
    public void setAtacado(Pokemon pokemon, WeatherCondition weatherCondition) throws MuerteException {

    }

    @Override
    public void atacar(Atacable atacable, WeatherCondition weatherCondition) throws MuerteException {

    }

    @Override
    public void roundStart(WeatherCondition weatherCondition) throws RoundStartException {

    }
}
