package Tema5.Examen22Colecc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mazo {
    private Map<Cromo, Integer> mazo;

   public  Mazo(){
       this.mazo = new HashMap<>();
   }
    public void addCromo(Cromo cromo, int numCromos){
        Integer numPrevioUnidades = mazo.get(cromo);
         if (numPrevioUnidades == null){
            mazo.put(cromo,numCromos);
        }else{
            mazo.replace(cromo, numCromos + numPrevioUnidades);
        }

    }
    public void addCromo(Cromo cromo){
       addCromo(cromo,1);
    }
    public void  intercambiarCromo (Cromo cromoMio,Cromo cromoOtro) throws MazoException {
        if (!mazo.containsKey(cromoMio)){
            throw  new MazoException("No tengo ese cromo");
        }
        Integer numPrevioUnidades = mazo.get(cromoMio);
        if (numPrevioUnidades > 1){
            mazo.replace(cromoMio,  numPrevioUnidades -1);
        }else mazo.remove(cromoMio);
        addCromo(cromoOtro);
    }
    public void mezclar(Mazo mazoNuevo){
       for (Map.Entry<Cromo, Integer> entrada : mazoNuevo.mazo.entrySet()){
           this.addCromo(entrada.getKey(), entrada.getValue());
       }
    }

    public int  contarDiferencias (){
      return mazo.size();
    }
    public List<Cromo> cromosDeUnEquipo(String nombreEquipo){
      return mazo.keySet().stream().filter(cromo -> cromo.getEquipo().equals(nombreEquipo)).toList();
    }
    public double alturaMedia(String equipo) throws MazoException {
       return cromosDeUnEquipo(equipo).stream().filter(cromo -> cromo instanceof Jugador).mapToInt(cromo -> ((Jugador)cromo).getAltura()).average().orElseThrow(()->new MazoException("No hay jugadores de ese equipo"));

    }
}
