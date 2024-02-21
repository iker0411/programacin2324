package Tema5.Boletin6_1.ejecicio2;

import Tema5.Boletin6_1.Ejercicio1.Alumno;
import Tema5.Boletin6_1.Ejercicio1.AlumnoException;

import java.util.HashSet;
import java.util.Set;

public class Equipo {
    private String nombre;
    private Set<Tema5.Boletin6_1.Ejercicio1.Alumno> alumnos;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.alumnos = new HashSet<>();
    }

    public void addAlumno(Tema5.Boletin6_1.Ejercicio1.Alumno alumno)throws Tema5.Boletin6_1.Ejercicio1.AlumnoException {
        if (alumnos.add(alumno) == false){
            throw new Tema5.Boletin6_1.Ejercicio1.AlumnoException("El alumno ya existe en este equipo");
        }
    }

    public void removeAlumno(Tema5.Boletin6_1.Ejercicio1.Alumno alumno)throws Tema5.Boletin6_1.Ejercicio1.AlumnoException {
        if (alumnos.remove(alumno) == false){
            throw new AlumnoException("El alumno no estaba en el equipo");
        }
    }

    public Tema5.Boletin6_1.Ejercicio1.Alumno perteneceEquipo(Tema5.Boletin6_1.Ejercicio1.Alumno alumno){
        if (alumnos.contains(alumno)){
            return alumno;
        }else {
            return null;
        }
    }

    public Set<Alumno> getAlumnos() {
        return alumnos;
    }

    public Tema5.Boletin6_1.ejecicio2.Equipo unionEquipos(Tema5.Boletin6_1.ejecicio2.Equipo equipo2 ){
        Tema5.Boletin6_1.ejecicio2.Equipo equipoV = new Tema5.Boletin6_1.ejecicio2.Equipo("Union de: " + nombre + " con " + equipo2.nombre );
        equipoV.alumnos.addAll(alumnos);
        equipoV.alumnos.addAll(equipo2.alumnos);
        return equipoV;
    }

    public Tema5.Boletin6_1.ejecicio2.Equipo interseccionEquipos(Tema5.Boletin6_1.ejecicio2.Equipo equipo2 ){
        Tema5.Boletin6_1.ejecicio2.Equipo equipoV = new Tema5.Boletin6_1.ejecicio2.Equipo("Intersección: " + nombre + " con " + equipo2.nombre );
        equipoV.alumnos.addAll(alumnos);
        equipoV.alumnos.retainAll(equipo2.alumnos);
        return equipoV;
    }
}
