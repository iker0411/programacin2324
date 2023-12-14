package Tema3.Biblioteca;

import java.util.Objects;

public class Usuario {
    private String nombre;
    private String apellido;
    private String dni;
    private String numerodesocio;

    public Usuario(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(dni, usuario.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    public void setNumerodesocio(String numerodesocio) {
        this.numerodesocio = numerodesocio;
    }
}
