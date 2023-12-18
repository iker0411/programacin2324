package Tema3.Biblioteca;

import java.util.Arrays;
import java.util.PrimitiveIterator;

public class Biblioteca {

    public static final int NUMERO_MAX_USUARIOS = 2;
    public static final int NUMERO_MAX_LIBROS = 2;
    private String nombre;
    private Libro[] libros;
    private Usuario[] usuarios;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new Libro[NUMERO_MAX_LIBROS];
        this.usuarios = new Usuario[NUMERO_MAX_USUARIOS];

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
