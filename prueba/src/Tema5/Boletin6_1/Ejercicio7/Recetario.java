package Tema5.Boletin6_1.Ejercicio7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Recetario {
    private HashMap<String, Receta> recetas;

    public Recetario(){
        recetas = new HashMap<>();
    }

    public void annadirReceta(Receta nuevaReceta) throws RecetaException {
        if(recetas.containsKey(nuevaReceta.getNombre())){
            throw new RecetaException("Ya existe una receta con ese nombre");
        }

        recetas.put(nuevaReceta.getNombre(), nuevaReceta);
    }

    public List<Receta> listadoRecetasOrdenadasAlfabeticamente() throws RecetaException {
        if (recetas.isEmpty()){
            throw new RecetaException("No hay recetas");
        }

        return recetas.values().stream().sorted().toList();
    }
    public List<Receta> listadoRecetasConIngredienteOrdenadasPorTiempoPreparacion(String ingrediente) throws RecetaException {
        List <Receta> listaRecetas = recetas.values().stream().filter(r -> r.necesitaIngrediente(ingrediente)).toList();

        if (listaRecetas.isEmpty()){
            throw new RecetaException("No hay recetas con ese ingrediente");
        }

        listaRecetas.sort((r1 , r2) -> r1.getTiempoPreparacion() - r2.getTiempoPreparacion());

        return listaRecetas;
    }
}
