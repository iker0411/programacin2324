package Tema5.Boletin6_1.Ejercicio7;

import jdk.incubator.vector.VectorOperators;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class Receta {
    private String nombreReceta;

    public String getNombreReceta() {
        return nombreReceta;
    }

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
            Boolean encontrado = false;
            while (it.hasNext() && !encontrado){
                Ingrediente i = it.next();
                if (ingredienteNuevo.getNombre().equals(i.getNombre())){
                    i.addCantidad(ingredienteNuevo.getCantidad());
                    encontrado = true;
                }

            }
          if (!encontrado){
              ingredientes.add(ingredienteNuevo);
          }
        }
    }
    public void borrarIngredientes (Ingrediente ingredienteABorrar) throws RecetaException{
        if (ingredientes.contains(ingredienteABorrar)){
            throw new RecetaException("La receta no contiene ese ingrediente");
        }
        pasos.removeIf(pasos -> pasos.contains(ingredienteABorrar.getNombre()));
    }

    public void  anadirPasoDetrasDe(String pasoNueva, String pasoExistente) throws RecetaException{
        int posPasoExistente= pasos.indexOf(pasoExistente);

        if (posPasoExistente == -1){
            throw new RecetaException("La receta no contiene ese paso");
        }
        pasos.add(posPasoExistente + 1, pasoNueva);
    }

    public int getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public int compareTo(Receta otra){
        return  this.nombreReceta.compareTo(otra.nombreReceta);
    }
}
