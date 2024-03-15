package Tema5.Boletin6_1.Ejercicio6;

import java.util.stream.Stream;

public class GranAlmacen {
    public static final int NUMERO_DE_CAJAS = 20;

    private int numeroClientes;
    private Caja[] cajas;

    public GranAlmacen() {
        this.cajas = new Caja[NUMERO_DE_CAJAS];
        for (int i = 0; i < cajas.length; i++) {
            this.cajas[i] = new Caja(i + 1);
        }
        this.numeroClientes = 0;
    }

    /**
     * @param numCaja Numero del 1 a NUMERO_DE_CAJAS(20)
     */
    public void abrirCaja(int numCaja) throws AlmacenException {
        if (numCaja < 1 || numCaja > NUMERO_DE_CAJAS) {
            throw new AlmacenException("La caja no existe");
        }
        cajas[numCaja - 1].abrirCaja();
    }

    public void cerrarCaja(int numCaja) throws AlmacenException {
        if (numCaja < 1 || numCaja > NUMERO_DE_CAJAS) {
            throw new AlmacenException("La caja no existe");
        }
        cajas[numCaja - 1].cerrarCaja();
    }

    public String nuevoCliente() throws AlmacenException {
        if (Stream.of(cajas).filter(Caja::isAbierta).count() == 0) {
            throw new AlmacenException("No puedo tener clientes, ya que no hay cajas abiertas");
        }
        Caja c = Stream.of(cajas).filter(Caja::isAbierta).sorted((a, b) -> a.getClientes() - b.getClientes()).toList().get(0);
        c.anadirCliente(++numeroClientes);
        return "Es usted el cliente número " + numeroClientes + " y debe ir a la caja número " + c.getNumeroCaja();
    }

    public Integer atenderCliente(int numeroCaja) throws AlmacenException {
        if (numeroCaja < 1 || numeroCaja > NUMERO_DE_CAJAS) {
            throw new AlmacenException("La caja no existe");
        }
        return cajas[numeroCaja - 1].atenderCliente();
    }
}
