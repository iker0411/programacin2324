package Tema5.Practica_No_Evaluable_Recetas_de_Cocina;




public class Main {
    public static final String TOKEN_FINALIZACION = "fin";
    public static void main(String[] args) {
        Restaurante r = new Restaurante();

    }

    private static void nuevaReceta() {
        String nombre = MIEntradaSalida2_0.leerCadena("Nombre de la receta");
        double duracion = MIEntradaSalida2_0.leerDoublePositivo("Duración de la receta");
        Receta plato = new Receta(nombre, duracion);

        String cadena = null;
        int cantidad;
        do {
            cadena = MIEntradaSalida2_0.leerCadena("Introduce el nombre del ingrediente");
            if (!cadena.equals(TOKEN_FINALIZACION)) {
                cantidad = MIEntradaSalida2_0.leerEnteroPositivo("Introduzca la cantidad del ingrediente");
                plato.addIngrediente(cadena, cantidad);
            }
        } while(!cadena.equals(TOKEN_FINALIZACION));

        do {
            cadena = MIEntradaSalida2_0.leerCadena("Introduce el paso a seguir");
            if (!cadena.equals(TOKEN_FINALIZACION)) {
                plato.addPaso(cadena);
            }
        } while(!cadena.equals(TOKEN_FINALIZACION));

        //TODO: Añadir la Receta al Menu del Restaurante
    }
}
