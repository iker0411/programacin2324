package Tema5.Boletin6_1.Ejercicio3;

import Tema3.Boletin4_3_2.MensajesExcepcion;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Alumno extends Persona{
    private LocalDate fechaNacimineto;

    private static final int MAYORIA_EDAD = 18;

    public Alumno(String nombre, LocalDate fecha) {
        super(nombre);
        fechaNacimineto = fecha;
    }

    @Override
    public void sendMessage(Persona receptor, String mensaje) throws MensajesExcepcion {
        LocalDate fechaMinima = LocalDate.now().minusYears(MAYORIA_EDAD);
        if (receptor instanceof Alumno && fechaNacimineto.isAfter(fechaMinima)) throw new MensajesExcepcion("Los alumnos menores de edad no pueden enviar mensajes a otros alumnos");
        super.sendMessage(receptor, mensaje);
    }

}
