package ejercicio2y3;

public class Articulo {
    private String codigo;
    private String descripcion;
    private double precioCompra;
    private double precioVenta;
    private int stock;

    // CONSTRUCTOR
    public Articulo(String cod, String desc, double comp, double vent, int tock) {
        this.codigo = cod;
        this.descripcion = desc;
        this.precioCompra = comp;
        this.precioVenta = vent;
        this.stock = tock;
    }

    @Override
    public String toString() {
        String mensaje = "";
        mensaje = "Codigo: " + codigo + " | Descripcion: " + descripcion + " | Stock: " + stock;
        return mensaje;
    }

    // GETTERS
    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public int getStock() {
        return stock;
    }
    //Metodos
    

}
