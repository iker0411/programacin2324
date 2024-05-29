package REPASO_OBJETO_2;

import Tema5.Practica_No_Evaluable_Recetas_de_Cocina.MIEntradaSalida2_0;

public class Main {
    private static Granja granja = new Granja("Granja de Alberto");

    public static void main(String[] args) {

        int op;
        do {
            menu();
            op = MIEntradaSalida2_0.leerEnteroDeRango("Seleciona una opción: ", 1, 9);
            switch (op) {
                case 1:
                    addanimal();
                    break;
                case 2:
                    realizarChequeo();
                    break;
                case 3:
                    break;
            }
        } while (op != 9);
    }


    public static void menu() {
        System.out.println("""
                1)Añadir animal
                2)Realizar chequeo
                3)Alimentar al animal
                4)Comprobar el estado de salud del los animales
                5)Añadir producto
                6)Reponer producto
                7)Compra producto
                8)Listar todos los productos
                9)Salir
                """);
    }

    public static void addanimal() {
        Tanimales tanimales = MIEntradaSalida2_0.leerEnum("Selecciona el tipo de animal: ", Tanimales.values());
        int edad = MIEntradaSalida2_0.leerEnteroPositivo("Introduce la edad del animal");
        try {
            granja.anadirAnimal(tanimales, edad);
        } catch (AnimalException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void realizarChequeo() {
        Animal animal = MIEntradaSalida2_0.leerEnum("Selecciona el animal: ", granja.getAnimales().toArray(new Animal[0]));
    }
}
