package Tema3.Boletin4_3_1;

import java.util.Random;

public class Juego {
    private Carta[] baraja;

    private int cartasRepartidas;

    public Juego(Carta[] baraja) {
        this.baraja = baraja;
        cartasRepartidas = 0;
    }

    public Carta[] getBaraja() {
        return baraja;
    }

    public void mostrarBaraja(){
        for (int i = cartasRepartidas; i < baraja.length; i++){
            System.out.println(baraja[i]);
        }
    }
    public void baraja(){
        Random m = new Random();

        Carta cartaCambiar;
        for (int i = cartasRepartidas; i < baraja.length; i++){
            int posicionAleatoria = m.nextInt(cartasRepartidas, baraja.length);


            cartaCambiar = baraja[i];
            baraja[i] = baraja[posicionAleatoria];
            baraja[posicionAleatoria] = cartaCambiar;


        }
    }
    public  void repartircartas (int numjugadores, int numCartas) throws JuegoException {
        if (baraja.length - cartasRepartidas >= (numCartas * numjugadores)){
            for (int i = 0; i < numjugadores; i++){
                System.out.println("Repartiendo cartas al jugador " + ( i + 1));
                for (int j = 0; j < numCartas; j++);{
                    System.out.println("\t" + baraja[numCartas*i + j + cartasRepartidas]);
                    cartasRepartidas++;
                }
            }
        } else {
            throw new JuegoException("No hay suficientes cartas para repartir");


        }
    }
}
