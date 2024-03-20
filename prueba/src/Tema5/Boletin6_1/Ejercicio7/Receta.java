package Tema5.Boletin6_1.Ejercicio7;



import java.util.*;
import java.util.stream.Stream;

public class Receta implements Comparable<Receta> {
    private String nombre;
    private int tiempoPreparacion;
    Set<Ingrediente> ingredientes;
    List<String> pasos;

    public Receta(String nombre, int tiempoPreparacion) {
        this.nombre = nombre;
        this.tiempoPreparacion = tiempoPreparacion;
        this.ingredientes = new HashSet<>();
        this.pasos = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public boolean necesitaIngrediente(String nombreIngrediente){

        return ingredientes.stream().anyMatch(i -> i.getNombre().equals(nombreIngrediente));
    }

    public void annadirIngrediente(Ingrediente ingredienteNuevo){
        boolean encontrado = false;
        Iterator<Ingrediente> it = ingredientes.iterator();

        while (it.hasNext()){
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

    public void borrarIngrediente(Ingrediente ingredienteABorrar) throws RecetaException {
        if (!ingredientes.remove(ingredienteABorrar)){
            throw new RecetaException("El ingrediente no existe en la receta");
        }

        pasos.removeIf(paso -> paso.contains(ingredienteABorrar.getNombre()));
    }

    public void annadirPasoDetrasDe(String pasoNuevo, String pasoExistente) throws RecetaException {
        int posPasoExistente = pasos.indexOf(pasoExistente);

        if (posPasoExistente == -1){
            throw new RecetaException("La receta no contiene ese paso");
        }

        pasos.add(posPasoExistente + 1, pasoNuevo);
    }

    public boolean contieneIngrediente(String ingrediente) {
        for (Ingrediente i : ingredientes) {
            if (i.getNombre().equals(ingrediente)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int compareTo(Receta o) {
        return this.nombre.compareTo(o.nombre);
    }
}
