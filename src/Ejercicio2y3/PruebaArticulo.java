package ejercicio2y3;

import java.util.Arrays;

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
    static public void crear4(){
        Articulo A1 = new Articulo("A1", "Articulo 1", 0, 0, 1);
        Articulo A2 = new Articulo("A2", "Articulo 2", 0, 0, 1);
        Articulo A3 = new Articulo("A3", "Articulo 3", 0, 0, 1);
        Articulo A4 = new Articulo("A4", "Articulo 4", 0, 0, 1);
        System.out.println(A1);
        System.out.println(A2);
        System.out.println(A3);
        System.out.println(A4);
        System.out.println("Objetos Creados");
        
    }

    @Override
    public String toString() {
        return "Lista: " + Arrays.toString(articulos);
    }
}
