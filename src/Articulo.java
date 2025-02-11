public class Articulo {
    private String codigo;
    private String descripcion;
    private double precioCompra;
    private double precioVenta;
    private int stock;
    //CONSTRUCTOR
    public Articulo(String cod, String desc){
        this.codigo = cod;
        this.descripcion = desc;
    }
    @Override
    public String toString(){
        String mensaje = "";
        mensaje = "Codigo: "+this.codigo+"|Descripcion: "+descripcion;
        return mensaje;
    }
    //GETTERS
    public String getCodigo(){
        return codigo;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public double getPrecioCompra(){
        return precioCompra;
    }
    public double getPrecioVenta(){
        return precioVenta;
    }
    public int getStock(){
        return stock;
    }
    
}
