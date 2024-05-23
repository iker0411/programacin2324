package ExamenPokemonRecuperacionHerencia.interfaces;

import ExamenPokemonRecuperacionHerencia.enums.WeatherCondition;
import ExamenPokemonRecuperacionHerencia.exceptions.MuerteException;
import ExamenPokemonRecuperacionHerencia.model.Pokemon;

public interface Atacable {
    public void setAtacado(Pokemon pokemon, WeatherCondition weatherCondition)throws MuerteException;

}
