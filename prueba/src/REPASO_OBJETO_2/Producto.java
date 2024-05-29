package REPASO_OBJETO_2;

public class Producto {
    private String nombreProducto;
    private int numeroUnidades;
    private double precio;
    private Tproductos tipoProducto;

    public Producto(String nombreProducto, int numeroUnidades, double precio, Tproductos tipoProducto) {
        this.nombreProducto = nombreProducto;
        this.numeroUnidades = numeroUnidades;
        this.precio = precio;
        this.tipoProducto = tipoProducto;
    }

    public int getNumeroUnidades() {
        return numeroUnidades;
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public Tproductos getTipoProducto() {
        return tipoProducto;
    }

    public void reponerUnidades(int unidadesNuevas) throws ProductoException {
        if (unidadesNuevas < 0) {
            throw new ProductoException("No se acepta valores negativos");
        }
        numeroUnidades += unidadesNuevas;
    }

    public void comprarUnidades(int unidadesCompra) throws ProductoException {
        if (unidadesCompra < 0) {
            throw new ProductoException("No puedes comprar un numero negativo de unidades");
        }
        if (unidadesCompra > numeroUnidades) {
            throw new ProductoException("No hay suficiente stock");
        }
        numeroUnidades -= unidadesCompra;
    }

    public boolean isDisponible() {
        return numeroUnidades > 0;
    }
}
