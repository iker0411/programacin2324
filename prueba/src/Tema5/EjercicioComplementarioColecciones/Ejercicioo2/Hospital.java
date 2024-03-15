package Tema5.EjercicioComplementarioColecciones.Ejercicioo2;

import java.util.LinkedList;

public class Hospital {

    LinkedList<Paciente> pacientes;

    public Hospital() {
        this.pacientes = new LinkedList<>();
    }

    public void anadirPaciente(Paciente paciente){
        int posicion = 0;
        boolean encontrado = false;
        Integer<Paciente> pacienteIterator = pacientes.iterator();
        while (pacienteIterator.hasNext() && !encontrado){

            Paciente paciente1 = pacienteIterator.next();
            if(paciente.compareTo(paciente1) < 0){
                encontrado = true;
            }else {
                posicion++;
            }
        }

    }

}
