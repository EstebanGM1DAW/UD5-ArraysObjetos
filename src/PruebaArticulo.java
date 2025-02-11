public class PruebaArticulo {
    private Articulo[] articulos;
    private int contador;

    // Constructor que recibe el tamaño del array
    public PruebaArticulo(int tamaño) {
        this.articulos = new Articulo[tamaño];
        this.contador = 0;
    }

    public boolean almacena(Articulo articulo) {
        if (contador < articulos.length) { // Verifica si hay espacio en el array
            articulos[contador] = articulo;
            contador++;
            return true;
        }
        return false;
    }
}

