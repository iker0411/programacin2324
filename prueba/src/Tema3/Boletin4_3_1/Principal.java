package Tema3.Boletin4_3_1;

public class Principal {
    public static final String[] palos = {"Espadas", "Oros", "Basto", "Copas"};
    public static final int CARTAS_POR_PALOS = 10;
    public static void main(String[] args) {
        Carta[] baraja = new Carta[palos.length * CARTAS_POR_PALOS];

        for (int i = 0; i < palos.length; i++){
            for (int j = 0; j < CARTAS_POR_PALOS;j++){
                baraja[i*CARTAS_POR_PALOS + j] = new Carta(palos[i],String.valueOf(j+1));
            }
        }
        Juego j = new Juego(baraja);
        try {
            j.repartircartas(13,4);
        }catch (JuegoException e){
            System.out.println(e.getMessage());
        }
        j.mostrarBaraja();
        //j.baraja();
        //j.mostrarBaraja();
    }
}
