package Tema5.Boletin6_1.Ejercicio7;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Receta {
    private String nombreReceta;
    private int tiempoPreparacion;
    HashSet<Ingrediente> ingredientes;
    List<String> pasos;

    public Receta(String nombreReceta, int tiempoPreparacion) {
        this.nombreReceta = nombreReceta;
        this.tiempoPreparacion = tiempoPreparacion;
        this.ingredientes = new HashSet<>();
        this.pasos = new LinkedList<>();
    }

    public boolean necesitaIngrediente(String nombreIngrediente){
      return   ingredientes.stream().anyMatch(i -> i.getNombre().equals(nombreIngrediente));
    }

    public void anadirIgredientes(Ingrediente ingredienteNuevo){
        if (ingredientes.contains(ingredienteNuevo)) {
            Iterator<Ingrediente> it = ingredientes.iterator();
            while (it.hasNext()){
                Ingrediente i = it.next();
                if (ingredienteNuevo.getNombre().equals(i.getNombre())){
                    i.addCantidad(ingredienteNuevo.getCantidad());
                }
            }
        }
    }
}
