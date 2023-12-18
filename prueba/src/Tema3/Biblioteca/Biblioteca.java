package Tema3.Biblioteca;

import java.util.Arrays;
import java.util.PrimitiveIterator;

public class Biblioteca {

    public static final int NUMERO_MAX_USUARIOS = 2;
    public static final int NUMERO_MAX_LIBROS = 2;
    public static final int NUMERO_MAX_PESTAMOS = 5;
    private String nombre;
    private Libro[] libros;
    private Usuario[] usuarios;
    private final Prestamo[] prestamos;
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new Libro[NUMERO_MAX_LIBROS];
        this.usuarios = new Usuario[NUMERO_MAX_USUARIOS];
        this.prestamos = new  Prestamo[NUMERO_MAX_PESTAMOS];

    }
    public void altaSocio( Usuario u ) throws BibliotecaException{
        int cuentaUsuario = cuentaUsuario();
        if (existeUsuario(u)){
            throw  new BibliotecaException(" Ya existe este usuario con el dni ");
        }

        if (cuentaUsuario >=NUMERO_MAX_USUARIOS){
            throw new BibliotecaException("No podemos admitir más usuarios ");
        }
        u.setNumerodesocio(String.valueOf(cuentaUsuario()+1));
        for (int i = 0; i<usuarios.length; i++){
            if (usuarios[i]== null){
                usuarios[i] = u;
                break;
            }
        }
    }

    public void agregarNuevoLibro(Libro l)throws BibliotecaException{
        if (existeLibro(l)){
            throw new BibliotecaException("Este libro ya está dado de alta");
        }
        if (cuentaLibro()== NUMERO_MAX_LIBROS){
            throw new BibliotecaException("No podemos admitir más libros");
        }
        for (int i= 0; i < libros.length; i++){
            if(libros[i] != null){
               libros[i] = l;
               break;
            }
        }
    }
    public void realizarPrestamo(Usuario u, Libro l)throws BibliotecaException{
        /*
        1.No repetir 2 cees el mismo prestamo a la vez
        2.Dispoiblilidad del Libro.
        3.No Superar el numero máximo de prestamo silmultáneo.
         */
        if(l.getEjemplaresDisponibles()==0){
            throw new BibliotecaException("No nos quedan ejempplares");
        }
        if (getNumeroPrestamosActivosUsuario(u)==Prestamo.NUM_DIAS_PRESTAMO){
            throw new BibliotecaException("No puedes hacer más prestamoos");
        }
    }
    public int getNumeroPrestamosActivosUsuario(Usuario u){
        int contadorPrestamos = 0;
        for (int i = 0; i<prestamos.length; i++){
            if (prestamos[i] == null){
                break;
            }
            if (prestamos[i] != null && prestamos[i].getUsuario().equals(u)&& prestamos[i].estaActivo()){
                contadorPrestamos++;
            }
        }
        return contadorPrestamos;
    }
    public boolean existeUsuario(Usuario u) {
        boolean usuarioEncontrado = false;
        for (int i = 0; i < usuarios.length && !usuarioEncontrado; i++) {
            if (u.equals(usuarios[i])) {
                usuarioEncontrado = true;
            }
        }
        return usuarioEncontrado;
    }
    public  int cuentaUsuario(){
        int cont = 0;
        for (int i= 0; i < usuarios.length; i++){
            if(usuarios[i] != null){
               cont++;
            }
        }
        return cont;
    }

    public boolean existeLibro(Libro l){
        boolean usuarioEncontrado = false;
        for (int i= 0; i < libros.length && !usuarioEncontrado; i++){
            if(l.equals(libros[i])){
                usuarioEncontrado = true;
            }
        }
        return usuarioEncontrado;
    }
    public  int cuentaLibro(){
        int cont = 0;
        for (int i= 0; i < libros.length; i++){
            if(libros[i] != null){
                cont++;
            }
        }
        return cont;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Biblioteca{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", libros=").append(Arrays.toString(libros));
        sb.append(", usuarios=").append(Arrays.toString(usuarios));
        sb.append('}');
        return sb.toString();
    }

}
