package Tema3.examenobjetos;

public class Televisor {

    private int altura;

    private int anchura;

    private String protocolos;

    private String conexiones;

    private Pixel[][] panel;

    public Televisor(int altura, int anchura, String conexiones, String protocolos) {
        this.altura = altura;
        this.anchura = anchura;
        this.protocolos = protocolos;
        this.conexiones = conexiones;
        panel = new Pixel[altura][anchura];
        inicializarPanel();
    }

    public int getAltura() {
        return altura;
    }

    public int getAnchura() {
        return anchura;
    }

    private void inicializarPanel() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                double r = Math.random();
                panel[i][j] = new Pixel(r <= 0.03);
            }
        }
    }

    public boolean isDefectuoso() {
        int cont = 0;
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                if (panel[i][j].isDefecturoso()) {
                    cont++;
                }
            }
        }
        return cont >= altura * anchura * 0.03;
    }

    public void setImagen(String[][] imagen) {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                int rojo = Integer.parseInt(imagen[i][j].substring(1, 3), 16);
                int verder = Integer.parseInt(imagen[i][j].substring(3, 5), 16);
                int azul = Integer.parseInt(imagen[i][j].substring(5, 7), 16);
                panel[i][j].setRojo(rojo);
                panel[i][j].setVerder(verder);
                panel[i][j].setAzul(azul);
            }
        }
    }

    public String getColorPromedio() {
        long rojo = 0;
        long verde = 0;
        long azul = 0;
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                rojo += panel[i][j].getRojo();
                verde += panel[i][j].getVerder();
                azul += panel[i][j].getAzul();
            }
        }
        int colorPromedioRojo = (int) (rojo / (altura * anchura));
        int colorPromedioVerde = (int) (verde / (altura * anchura));
        int colorPromedioAzul = (int) (azul / (altura * anchura));
        return String.format("#%02X#%02X#%02X", colorPromedioRojo, colorPromedioVerde, colorPromedioAzul);
    }

    public String conectar(Dispositivo dispositivo) throws DispositivoNoCompatibleException {
        String[] conexionesTelevisor = conexiones.split("");
        String[] conexionesDispositivo = dispositivo.getConexiones().split("");
        String conexionUtilizada = null;
        for (int i = 0; i < conexionesTelevisor.length && conexionUtilizada == null; i++) {
            for (int j = 0; j < conexionesDispositivo.length && conexionUtilizada == null; j++) {
                if (conexionesTelevisor[i].equals(conexionesTelevisor[j])) {
                    conexionUtilizada = conexionesDispositivo[j];
                }
            }
        }
        if (conexionUtilizada == null) {
            throw new DispositivoNoCompatibleException("El dispositivo" + dispositivo.getNombre() + " no tiene ninguna conexión compatible");
        }

        String[] protocoloTelevisor = protocolos.split("");
        String[] protocoloDispositivo = dispositivo.getProtocolos().split("");
        String protocoloUtilizado = null;
        for (int i = 0; i < protocoloTelevisor.length && protocoloUtilizado == null; i++) {
            for (int j = 0; j < protocoloDispositivo.length && protocoloUtilizado == null; j++) {
                if (protocoloTelevisor[i].equals(protocoloTelevisor[j])) {
                    protocoloUtilizado= protocoloDispositivo[j];
                }
            }
        }
        if (protocoloUtilizado == null){
            throw new DispositivoNoCompatibleException("El dispositivo" + dispositivo.getNombre() + " no tiene ninguna conexión compatible");
        }
        return String.format("Dispositivo %s conectado en el puerto %s usando el protocolo %s", dispositivo.getNombre(),conexionUtilizada,protocoloUtilizado);
    }
}
