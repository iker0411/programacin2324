package Tema3.Boletin4_3_2;

import javax.swing.*;

public class Persona {

    private static final int TAMANO_Bandeja = 5;
    private String nombre;
    private Mensaje[] mensajesRecibidos;
    private Mensaje[] mensajesEnviados;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.mensajesRecibidos = new Mensaje[TAMANO_Bandeja];
        this.mensajesEnviados = new Mensaje[TAMANO_Bandeja];
    }
    public void enviarMensaje(Persona detinatario, String asunto, String cuerpo) throws MensajesExcepcion {
        if (detinatario == null){
            throw new MensajesExcepcion("Destinataario erróneo");
        }
        if (asunto == null || asunto.length()==0){
            throw new MensajesExcepcion("Asunto vacio");
        }
        if (cuerpo == null || cuerpo.length()==0){
            throw new MensajesExcepcion("Cuerpo vacio");
        }
        if (mensajesEnviados[TAMANO_Bandeja-1] != null){
            throw  new MensajesExcepcion("Bandeja de salida esta llenada");
        }
        if (detinatario.mensajesRecibidos[TAMANO_Bandeja-1] != null){
            throw  new MensajesExcepcion("Bandeja de entrada esta llenada");
        }
        Mensaje m = new Mensaje(asunto, cuerpo, this, detinatario);
        //Bandeja de enviados
        boolean posVacio = false;
        for (int i = 0; i < TAMANO_Bandeja && !posVacio; i++){
            if (mensajesEnviados[i] == null){
                mensajesEnviados[i] = m;
                posVacio = true;
            }
        }
        //Bandeja de de reibidos del destinatario
        for (int i = 0; i < TAMANO_Bandeja && !posVacio; i++){
            if (detinatario.mensajesRecibidos[i] == null){
                detinatario.mensajesRecibidos[i] = m;
                posVacio = true;
            }
        }

    }
    public void mostrarBandejaEntrada(){
        if (mensajesRecibidos[0] == null){
            System.out.println("Su bandeja de entrada está vacia");
        }else {
            for (int i = 0; i < TAMANO_Bandeja && mensajesRecibidos[i]!=null; i++){
                System.out.println(mensajesRecibidos[i]);
            }
        }
    }
    public void mostrarBandejaSalida(){
        if (mensajesEnviados[0] == null){
            System.out.println("Su bandeja de salida está vacia");
        }else {
            for (int i = 0; i < TAMANO_Bandeja && mensajesEnviados[i]!=null; i++){
                System.out.println(mensajesEnviados[i]);
            }
        }
    }
    public void borrarMensajeEntradaMasAntiguo()throws MensajesExcepcion{
        if (mensajesEnviados[0] ==  null){
            throw new MensajesExcepcion("Su bandeja de salida esta vacía");
        }
        boolean salir = false;
        for (int i = 1; i < TAMANO_Bandeja && !salir; i++){
            mensajesEnviados[i-1] = mensajesEnviados[i];
            mensajesEnviados[i] = null;
            if (i<TAMANO_Bandeja-1 && mensajesEnviados[i+1] == null){
                salir = true;
            }
        }
    }
    public void borrarMensajeRecibidoMasAntiguo()throws MensajesExcepcion{
        if (mensajesRecibidos[0] ==  null){
            throw new MensajesExcepcion("Su bandeja de emtrada esta vacía");
        }
        boolean salir = false;
        for (int i = 1; i < TAMANO_Bandeja && !salir; i++){
            mensajesRecibidos[i-1] = mensajesRecibidos[i];
            mensajesRecibidos[i] = null;
            if (i<TAMANO_Bandeja-1 && mensajesRecibidos[i+1] == null){
                salir = true;
            }
        }
    }
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
