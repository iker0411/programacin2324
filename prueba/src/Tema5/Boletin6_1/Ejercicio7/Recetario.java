package Tema5.Boletin6_1.Ejercicio7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Recetario {
    HashMap<String,Receta> recetas;

    public Recetario() {
        this.recetas = new HashMap<>();
    }

    public void anadirReceta(Receta nuevaReceta) throws RecetaException{
        if (recetas.containsKey(nuevaReceta.getNombreReceta())){
            throw new RecetaException("Ya existe una receta con ese nombre");
        }
        recetas.put(nuevaReceta.getNombreReceta(), nuevaReceta);

    }
    public List<Receta> listadoRecetasOrdenadasAlfabeticamente() throws RecetaException{
       if (recetas.isEmpty()){
           throw new RecetaException("No hay recetas");
       }
        return recetas.values().stream().sorted().toList();

    }

    public List <Receta> listadoRecetasConIngredienteOrdenadasPorTiempoPreparacion(String ingrediente) throws  RecetaException{

        Stream <Receta>  ListaRecetas = recetas.values().stream().filter(receta -> receta.necesitaIngrediente(ingrediente));
        if (ListaRecetas.findAny().isEmpty()) {
            throw new RecetaException("No hay recetas con ee ingredientes");
        }
        ListaRecetas.sort((a,b)-> a.getTiempoPreparacion() - b.getTiempoPreparacion());
        return ListaRecetas;
    }
}
