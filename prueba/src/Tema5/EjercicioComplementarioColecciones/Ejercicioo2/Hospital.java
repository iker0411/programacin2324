package Tema5.EjercicioComplementarioColecciones.Ejercicioo2;

import Tema4.Boletin5_2_2.Forma;

import javax.swing.text.html.StyleSheet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Hospital {

    private  static int ticket = 1;

    LinkedList<Paciente> pacientes;

    public Hospital() {
        this.pacientes = new LinkedList<>();
    }

    public void anadirPaciente(Paciente paciente){
        Iterator<Paciente> pacienteIterator = pacientes.iterator();
        int posicion = 0;
        boolean posEncontrada = false;

        while (pacienteIterator.hasNext() && !posEncontrada){
            Paciente paciente1 = pacienteIterator.next();
            if (paciente.compareTo(paciente1) < 0){
                posEncontrada = true;
            }else{
                posicion++;
            }

        }
        pacientes.add(posicion, paciente);
    }
    public List<Paciente> ListadoPacientesPrioridad(Paciente paciente){
       return (LinkedList<Paciente>) pacientes.clone();
    }
    public Paciente atenderPaciente(Paciente paciente){
        return pacientes.poll();
    }
    public List<Paciente> ListadoPacienteEdad(){
        return pacientes.stream().sorted((p1,p2)-> p2.getEdad() - p1.getEdad()).toList();
    }
    public String datosEstadisticos(){
        StringBuilder datos = new StringBuilder();
        for (int i = 1; i <= Paciente.MIN_PRIORIDAD; i++){
            int finalI = i;
            List<Paciente> pacientesFiltrados = pacientes.stream().filter(p -> p.getPrioridad() == finalI).toList();
            datos.append("Hay ").append(pacientesFiltrados.stream().filter(p -> p.getPrioridad() == finalI)
            .count()).append(" paciente esperando de prioridad ")
             .append(i);
            datos.append("El paciente más adulto es: ").append(pacientesFiltrados.stream().mapToInt(Paciente::getEdad).max())
            .append(" y el paciente más joven es :").append(pacientes.stream()
            .mapToInt(Paciente::getEdad).min()).append("y la media de edad es: ") .append(pacientesFiltrados.stream()
            .mapToInt(Paciente::getEdad).average().orElse(0));
        }
        return datos.toString();

    }
}
