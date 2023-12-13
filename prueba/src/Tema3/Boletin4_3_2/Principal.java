package Tema3.Boletin4_3_2;

public class Principal {
    public static void main(String[] args) {
        Persona p1 = new Persona("Iker Mendez");
        Persona p2 = new Persona("Manuel Mendez");

        try{
            p1.enviarMensaje(p2, "Prueba de asunto", "Como estas");
            p1.enviarMensaje(p2, "Prueba de asunto", "Como estas");
            p1.enviarMensaje(p2, "Prueba de asunto", "Como estas");
            p1.enviarMensaje(p2, "Prueba de asunto", "Como estas");
            p1.enviarMensaje(p2, "Prueba de asunto", "Como estas");
            p1.enviarMensaje(p2, "Prueba de asunto", "Como estas");
            p1.enviarMensaje(p2, "Prueba de asunto", "Como estas");
        }catch (MensajesExcepcion m){
            System.out.println(m.getMessage());
        }
        p1.mostrarBandejaSalida();
        p1.mostrarBandejaEntrada();
    }
}
