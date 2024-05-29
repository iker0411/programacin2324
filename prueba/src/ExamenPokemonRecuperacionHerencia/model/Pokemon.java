package ExamenPokemonRecuperacionHerencia.model;

import ExamenPokemonRecuperacionHerencia.enums.WeatherCondition;
import ExamenPokemonRecuperacionHerencia.exceptions.MuerteException;
import ExamenPokemonRecuperacionHerencia.exceptions.PokemonException;
import ExamenPokemonRecuperacionHerencia.exceptions.RoundStartException;
import ExamenPokemonRecuperacionHerencia.interfaces.Atacable;

import java.text.ParseException;

public abstract class Pokemon {
    private String nombre;
    public final int SALUD_MIN = 0;
    public final int SALUD_MAX = 100;
    public final int ATAQUE_MAX = 15;
    public final int ATAQUE_MIN = 5;
    public final int DEFENSA_MIN = 5;
    public final int DEFENSA_MAX = 25;

    private int salud, ataque, defensa;

    public String getNombre() {
        return nombre;
    }

    public int getSalud() {
        return salud;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public Pokemon(String nombre, int salud, int ataque, int defensa) throws PokemonException{
        this.nombre = nombre;
        setSalud(salud);
        setAtaque(ataque);
        setDefensa(defensa);
    }

    public void setSalud(int salud)  throws PokemonException {
        if (salud < SALUD_MIN ){
           salud = SALUD_MIN;
        }else if (salud > SALUD_MAX){
            salud = SALUD_MAX;
        }
        this.salud = salud;
    }

    public void setAtaque(int ataque) throws PokemonException{
        if (ataque < ATAQUE_MIN ||  ataque > ATAQUE_MAX){
            throw  new PokemonException("Valores invalidos");
        }
        this.ataque = ataque;
    }

    public void setDefensa(int defensa) throws PokemonException {
        if ( defensa < DEFENSA_MIN || defensa > DEFENSA_MAX){
            throw new PokemonException("Valores invalidos");
        }
        this.defensa = defensa;
    }
    public abstract void atacar(Atacable atacable, WeatherCondition weatherCondition)throws MuerteException;
    public abstract void roundStart(WeatherCondition weatherCondition)throws RoundStartException;
    public boolean estaVivo(){
        return  salud > 0;
    }
}
