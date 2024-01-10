package Tema3.Boletin4_1_3;

public class Maquina {
    public static final int CAP_MAX_DEPOSITO_CAFE = 50;
    public static final int CAP_MAX_DEPOSITO_LECHE = 50;
    public static final int CAP_MAX_DEPOSITO_VAROS = 80;

    public static final double PRECIO_CAFE = 1;
    public static final double PRECIO_LECHE = 0.8;
    public static final double PRECIO_CAFE_LECHE = 1.5;

    public static final double MONEDERO_ININIAL = 10;
    private int cafeRestante;
    private int lecheRestante;
    private int vasosRestante;
    private double monedero;

    public Maquina() {
        rellenarDepsitos();
        monedero = MONEDERO_ININIAL;
    }

    public void rellenarDepsitos() {
        cafeRestante = CAP_MAX_DEPOSITO_CAFE;
        lecheRestante = CAP_MAX_DEPOSITO_LECHE;
        vasosRestante = CAP_MAX_DEPOSITO_VAROS;
    }


    public boolean puedoServirCafe() {
        return cafeRestante > 0 && vasosRestante > 0;
    }

    public boolean puedoServirLeche() {
        return lecheRestante > 0 && vasosRestante > 0;
    }

    public boolean puedoServirCafeLeche() {
        return cafeRestante > 0 && vasosRestante > 0 && lecheRestante > 0;
    }

    public void servirCafe() {
        System.out.println("Aqui tienes tu café");
        cafeRestante--;
        vasosRestante--;
    }

    public void servirLeche() {
        System.out.println("Aqui tienes tu Leche");
        lecheRestante--;
        vasosRestante--;
    }

    public void servircafeLeche() {
        System.out.println("Aqui tienes tu café con leche");
        cafeRestante--;
        lecheRestante--;
        vasosRestante--;
    }

    public String darCambio(double pago, double precio) throws MaquinaException {

        double cambio = pago - precio;

        if (pago == precio) {
            monedero = monedero + precio;
           return "Gracias por su compra, has dado el dinero justo";
        } else if (pago > precio && monedero >= (cambio)) {
            monedero = monedero + precio;
            return String.format("Recoge tu cambio de de %.2f euros ", cambio);
        } else if (precio > pago) {
            throw new MaquinaException("Pago insufiente");
        } else {
            throw new MaquinaException("Disculpe, no tenemos cambio");
        }
    }




}
