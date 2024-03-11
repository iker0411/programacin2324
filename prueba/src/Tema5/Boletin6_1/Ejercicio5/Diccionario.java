package Tema5.Boletin6_1.Ejercicio5;

import java.util.*;

public class Diccionario {
    private Map<String, List<String>> diccionario;

    public Diccionario(){
        this.diccionario = new HashMap<>();
    }

    public void anadirPalabra(String palabra, String definicion){
        if (!this.diccionario.containsKey(palabra)){
            List<String> definiciones = new ArrayList<>();
            this.diccionario.put(palabra, definiciones);
            definiciones.add(definicion);
        }else {
            this.diccionario.get(palabra).add(definicion);
        }
    }

    public List<String> buscarPalbra (String palabra) throws DiccionarioExcepccion {
        List<String> deficiones = this.diccionario.get(palabra);
        if (deficiones==null){
            throw new DiccionarioExcepccion("La palabra no ha sido encontrada");
        }
        return deficiones;
    }

    public void borrarPalabra (String palabra) throws DiccionarioExcepccion {
        List<String> deficiones = this.diccionario.remove(palabra);
        if (deficiones==null){
            throw new DiccionarioExcepccion("La palabra no ha sido encontrada");
        }
    }

    public List<String> listadoPalabra(String comienzoDePalabra){
        Set<String> claves = this.diccionario.keySet();
        List<String> palabraEncontradas = new ArrayList<>();
        for (String palabra:claves){
            if (palabra.startsWith(comienzoDePalabra)){
                palabraEncontradas.add(palabra);
            }
        }
        return palabraEncontradas;
    }

    public List<String> listadoPalabrasFlujo(String comienzoPalabra){
        return this.diccionario.keySet().stream().filter(palabra -> palabra.startsWith(comienzoPalabra)).toList();
    }


}
