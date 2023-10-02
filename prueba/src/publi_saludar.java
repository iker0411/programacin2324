public class publi_saludar {
    public static void main(String[] args) {
        saluda("Iker");
        saluda(55);
        int  a = 22;
        saluda(a);
        saluda(suma(a,9));
    }
    public static int suma (int a, int b){
        return a + b;
    }
    public static void saluda(String nombre){
        System.out.println("HOLA " + nombre);
    }
    public static void saluda(int  a){
        System.out.println("Nombre " + a);
    }
    public static void saluda(){
        System.out.println("HOLA MUNDO");
    }
}
