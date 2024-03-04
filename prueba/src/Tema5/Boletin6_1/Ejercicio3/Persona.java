package Tema5.Boletin6_1.Ejercicio3;

import Tema3.Boletin4_3_2.MensajesExcepcion;

import java.util.ArrayList;
import java.util.List;

public abstract class Persona {
    private String nombre;

    private List<Mensaje> bandejaEntrada;

    public Persona(String nombre) {
        this.nombre = nombre;
        bandejaEntrada = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    public void sendMessage(Persona receptor, String mensaje) throws MensajesExcepcion {
        receptor.bandejaEntrada.add(new Mensaje(this, mensaje));
    }

    public String leerMensaje() {
        StringBuilder mensaje = new StringBuilder();
        for (int i = 0; i < bandejaEntrada.size(); i++) {
            mensaje.append("Mensaje ").append(i + 1).append(": ").append(bandejaEntrada.get(i)).append("\n");

        }
        return  mensaje.toString();
    }

    public String leerMensajesOrdenados(){
        List<Mensaje> bandejaOrdenada = new ArrayList<>(bandejaEntrada);
        bandejaOrdenada.sort(null);

        StringBuilder mensaje = new StringBuilder();
        for (int i = 0; i < bandejaOrdenada.size(); i++) {
            mensaje.append("Mensaje ").append(i + 1).append(": ").append(bandejaOrdenada.get(i)).append("\n");

        }
        return  mensaje.toString();
    }


}
