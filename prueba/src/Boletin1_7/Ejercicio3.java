package Boletin1_7;


import Boletin1_1.MientradaSalida;

import java.util.Scanner;

public class Ejercicio3 {
    private static final  int M_VALUE = 1000;
    private static final  int D_VALUE = 500;
    private static final  int C_VALUE = 100;
    private static final  int I_VALUE = 50;
    private static final  int X_VALUE = 10;
    private static final  int V_VALUE = 1;
    public static void main(String[] args) {
        String numRomano = MientradaSalida.leerString("Introduce un número en romano");
        //numRomano = "DCXI"

        int valorDecimal = 0;
        int lastDigitValue = 0;
        for (int i = 0; i < numRomano.length(); i++){
            char digito = numRomano.charAt(i);
            int digiValue = valuedf(digito);

            if (i == 0){

                lastDigitValue = digiValue;

            }
            else {
                if (lastDigitValue >= digiValue) {
                    valorDecimal += digiValue;
                    lastDigitValue = digiValue;
                } else {
                    valorDecimal = valorDecimal + digiValue - (2 * lastDigitValue);
                }
            }
            lastDigitValue = digiValue;
        }
    }
    public static  int valuedf(char c){
        return  switch (c)
        {
            case 'M': yield  M_VALUE;
            case 'D': yield  D_VALUE;
            case 'C': yield  C_VALUE;
            case 'X': yield X_VALUE;
            case 'v': yield V_VALUE;
            case 'I': yield I_VALUE;
        };
    }
}

