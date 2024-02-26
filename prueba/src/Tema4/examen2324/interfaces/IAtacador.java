package Tema4.examen2324.interfaces;

import Tema4.examen2324.enums.WeatherCondition;
import Tema4.examen2324.exceptions.MuerteException;

public interface IAtacador {
    public  void atacar(Atacable objetivo, WeatherCondition tiempo)throws MuerteException;
}
