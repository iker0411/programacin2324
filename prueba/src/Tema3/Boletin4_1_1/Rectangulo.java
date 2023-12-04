package Tema3.Boletin4_1_1;

public class Rectangulo {
    public static  final double MAX_LONGITUD_ANCHO = 20;
    private double longitud;
    private double ancho;

    public static void main(String[] args) {
        Rectangulo r = new Rectangulo(5, 2);
        System.out.printf("El área del rectangulo es %f\n", r.calculaArea());
        System.out.printf("El perímetro del rectaángulo  es  %f\n", r.calculaPerimetro());
    }

    public Rectangulo(double l, double a){
       setLongitud(l);
       setAncho(a);
    }
    public double getLongitud(){
        return longitud;
    }

    public void setLongitud(double longitud) {
        if (longitud > 0 && longitud < MAX_LONGITUD_ANCHO){
            this.longitud = longitud;
        }else {
        }

    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        if (ancho > 0 && ancho < MAX_LONGITUD_ANCHO){
            this.ancho = ancho;
        }else{
            //TODO: Lanzar excepción
        }
    }
    public double calculaPerimetro(){
        return 2 * longitud + 2 * ancho;
    }

    public double calculaArea(){
        return longitud * ancho;
    }

}
