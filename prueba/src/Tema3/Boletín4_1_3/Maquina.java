package Tema3.Boletín4_1_3;

import Tema3.Biblioteca.Prestamo;

import java.util.PrimitiveIterator;

public class Maquina {
    public static final int CAP_MAX_DEPOSITO_CAFE = 50;
    public static final int CAP_MAX_DEPOSITO_LECHE = 50;
    public static final int CAP_MAX_DEPOSITO_VAROS = 80;

    public static final  double PRECIO_CAFE = 1;
    public static final  double PRECIO_LECHE = 0.8;
    public static final  double PRECIO_CAFE_LEHCE = 1.5;

    public static final double MONEDERO_ININIAL = 10;
    private int cafeRestante;
    private int lecheRestante;
    private int vasosRestante;
    private double monedero;

    public Maquina(){
        rellenarDepsitos();
        monedero = MONEDERO_ININIAL;
    }
    public void rellenarDepsitos(){
        cafeRestante = CAP_MAX_DEPOSITO_CAFE;
        lecheRestante = CAP_MAX_DEPOSITO_LECHE;
        vasosRestante = CAP_MAX_DEPOSITO_VAROS;
    }


}
