package Tema5.ExamenColecciones21.ejercicio2;

import java.util.LinkedList;


public class ListaGenerica<T extends Comparable<? super T>> {

	private LinkedList<T> lista;

	public ListaGenerica() {
		lista = new LinkedList<T>();
	}

	public void annadirElemento(T elemento) {
		lista.add(elemento);
	}

	public ListaGenerica<T> listaHastaElemento( T elementoBuscado) {
		ListaGenerica<T> elementoscopiados = new ListaGenerica<>();
		for (T elemento : lista) {
			elementoscopiados.annadirElemento(elemento);
			if (elemento.equals(elementoBuscado)) {
				return elementoscopiados;
			}
		}
		return null;
	}

	public  ListaGenerica<T> elementosMenores (T elementoFerencia){
		ListaGenerica<T> menores = new ListaGenerica<>();
		for (T elemento : lista){
			if (elemento.compareTo(elementoFerencia) < 0){
				menores.annadirElemento(elemento);
			}
		}
		return menores.lista.isEmpty()? null : menores;
	}
	

	@Override
	public String toString() {
		return "ListaGenerica=" + lista ;
	}
	
	
	
}
