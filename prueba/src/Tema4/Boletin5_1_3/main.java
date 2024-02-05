package Tema4.Boletin5_1_3;

public class main {
    public static void main(String[] args) {
        try {
            Mago magoA = new Mago("Manolo", TRaza.ENANO, 14, 18, 21);
            Mago magoB = new Mago("Jaimito", TRaza.ELFO, 12, 19, 19);
            Clerigo clerigoC = new Clerigo("Andres", TRaza.HUMANO, 19,14,23, "Antonio");
            System.out.println(magoA);
            System.out.println(magoB);
            System.out.println(clerigoC);

            magoA.aprendeHechizo("Pyro");
            magoA.aprendeHechizo("Aqua");
            magoB.aprendeHechizo("Pyro");

            System.out.println(magoA);
            System.out.println(magoB);
            System.out.println(clerigoC);

            magoA.lanzaHechizo(magoB, "Aqua");
            magoB.lanzaHechizo(magoA, "Pyro");
            clerigoC.curar(magoB);
            magoA.lanzaHechizo(magoB, "Pyro");

            System.out.println(magoA);
            System.out.println(magoB);
            System.out.println(clerigoC);

        } catch (PersonajeException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
