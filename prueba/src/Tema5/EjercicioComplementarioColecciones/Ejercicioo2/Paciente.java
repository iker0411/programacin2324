package Tema5.EjercicioComplementarioColecciones.Ejercicioo2;

import javax.swing.plaf.PanelUI;
import java.util.LinkedList;

public class Paciente implements Comparable<Paciente> {
    public static final int MIN_PRIORIDAD = 5;

    public static final int MAX_PRIORIDAD = 1;

    private String dni;
    private String nombre;
    private int edad;

    private int ordeLlegada;
    private int prioridad;

    public Paciente(String dni, String nombre, int edad, int prioridad, int ordeLlegada) throws HospitalException {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.ordeLlegada = ordeLlegada;
        setPrioridad(prioridad);
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) throws HospitalException {
        if (prioridad < MAX_PRIORIDAD || prioridad > MIN_PRIORIDAD) {
            throw new HospitalException("Valor invalido");
        }
        this.prioridad = prioridad;
    }

    @Override
    public int compareTo(Paciente otro) {
        if (prioridad - otro.prioridad == 0) {
            return prioridad - otro.prioridad;
        }
        return  prioridad - otro.prioridad;
    }
}
