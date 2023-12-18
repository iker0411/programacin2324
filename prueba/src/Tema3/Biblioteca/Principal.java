package Tema3.Biblioteca;

public class Principal {
    public static void main(String[] args) {
        Biblioteca b = new Biblioteca("Biblioteca");
        Usuario u = new Usuario("Iker","Mendez Palma", "265545245W");
        Usuario u2 = new Usuario("Manuel", "Mendez", "2655615448P");
        Libro l = new Libro("Platero y yo", "Juan Ramón Jiménez", "JDEHFE", 100, 20);
        try{
            b.altaSocio(u);
            b.altaSocio(u2);
            b.agregarNuevoLibro(l);
            System.out.println(b);
        }catch ( BibliotecaException e) {
            System.out.println(e.getMessage());
        }
    }
}
