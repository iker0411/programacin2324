package Tema3.EjercicioAvion;

import java.time.LocalDateTime;

public class Principal {
    public static void main(String[] args) {
        Deposito d = new Deposito(200000, 180000);
        Avion a = new Avion("Airbus", "446", 13, d);

        a.addRevision(new Revision(LocalDateTime.of(2023, 10, 8, 12, 8), true, 6));
        System.out.println(a.puedevolar(1500)? "Puede recorrer esa distancia" : "No puede volar esa distancia");
    }
}
