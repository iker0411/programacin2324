package Tema5.EjercicioComplementarioColecciones.Ejercicioo2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Hospital {

    List<Paciente> pacientes;

    public Hospital() {
        this.pacientes = new LinkedList<>();
    }

    public void anadirPaciente(Paciente paciente){
        Iterator<Paciente> iterator = pacientes.iterator();
        int posicion = 0;
        boolean posEncontrada = false;

        while (iterator.hasNext() && !posEncontrada){
            Paciente paciente1 = iterator.next();
            if (paciente.compareTo(paciente1) < 0){
                posEncontrada = true;
            }else{
                posicion++;
            }

        }
    }

}
