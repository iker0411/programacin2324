package Tema4.examen2324.interfaces;

import Tema4.examen2324.enums.WeatherCondition;
import Tema4.examen2324.exceptions.MuerteException;

import javax.swing.plaf.PanelUI;

public interface Atacable {
    public void recibirAtaque(WeatherCondition tiempo, int puntosAtaque, IAtacador atacador)throws MuerteException;
}
