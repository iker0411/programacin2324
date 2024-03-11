package Tema5.Ejercicio6;

import java.util.LinkedList;
import java.util.Queue;

public class Caja {
    private int numeroCaja;
    private boolean abierta;
    private Queue<Integer> cola;

    public int getNumeroCaja() {
        return numeroCaja;
    }

    public boolean isAbierta() {
        return abierta;
    }

    public Caja(int numeroCaja) {
        this.abierta = false;
        this.numeroCaja = numeroCaja;
        this.cola = new LinkedList<>();
    }

    public void abrirCaja()throws AlmacenException {
        if (abierta){
            throw new AlmacenException("La caja ya está abierta");
        }
        abierta= true;
    }

    public void cerrarCaja()throws AlmacenException{
        if (!abierta){
            throw new AlmacenException("La caja esta cerrada");
        }
        if (!cola.isEmpty()){
            throw new AlmacenException("Aún tienes clientes en la cola");
        }
        abierta = false;
    }

    public void anadirCliente(Integer cliente)throws AlmacenException{
        if (!abierta){
            throw new AlmacenException("No pudes añadir un cliente con la caja cerrada");
        }
        cola.add(cliente);
    }

    public Integer atenderCliente() throws AlmacenException{
        if (!abierta){
            throw new AlmacenException("No pudes añadir un cliente con la caja cerrada");
        }
        Integer cliente = cola.poll();
        if (cliente == null){
            throw new AlmacenException("No hay clientes en la caja");
        }
        return cliente;
    }

    public int getClientes(){
        return cola.size();
    }




}
