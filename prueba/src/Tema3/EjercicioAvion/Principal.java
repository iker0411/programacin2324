package Tema3.EjercicioAvion;

import java.time.LocalDateTime;

public class Principal {
    public static void main(String[] args) {
        Deposito d = new Deposito(200000, 180000);
        Avion a = new Avion("Airbus", "446", 13, d);

        a.addRevision(new Revision(LocalDateTime.now(), true, 6));
        System.out.println(a);
    }
}
