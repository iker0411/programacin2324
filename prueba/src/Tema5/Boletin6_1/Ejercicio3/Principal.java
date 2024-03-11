package Tema5.Boletin6_1.Ejercicio3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Persona prf1 = new Profesor("Pepe");
        Persona alu1 = new Alumno("Carmelo", LocalDate.of(2005,2,26));
        List<Persona> personas = new ArrayList<>();
        personas.add(prf1);
        personas.add(alu1);

      /*  try {
            personas.get(0).sendMessage(personas.get(1), "Mensaje de prueba0");
        }catch (MensajeException e){
            System.out.println(e.getMessage());
        }*/



    }
}
