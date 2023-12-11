package Tema3.Boletin4_2_1;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class principal {
    public static void main(String[] args) {
        Persona persona = new Persona("Iker", LocalDate.of(2004,11,26), 365215076, 173,51,'V');
        System.out.println(persona.numDias());

        char letraDNI = persona.getLetraDni();
        System.out.println("La letra del DNI es " + letraDNI);

        float imc = persona.getImc();
        System.out.println("El índice de masa corporal (IMC) es: " + imc);

        LocalDate birthday = LocalDate.of(2004,11,26);
        LocalDate today = LocalDate.now();
        Period p = Period.between(birthday, today);
        long p2 = ChronoUnit.DAYS.between(birthday, today);
        System.out.printf("Tengo %d días de viejo ", p2);
    }
}
