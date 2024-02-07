package Tema4.boletin5_2_1;

public class EsportsTournament {
    public static void main(String[] args) {
        FPSGamer player1 = new FPSGamer();
        Gamer player2 = new MOBAGamer();
        Gamer player3 = new SportsGamer();
        Gamer[] jugadores = {player1, player2, player3};
        startTournament(jugadores);
    }
    public static void startTournament(Gamer[] players){
       for (int i = 0; i < players.length; i++){
           players[i].playGame();
       }
    }
}
