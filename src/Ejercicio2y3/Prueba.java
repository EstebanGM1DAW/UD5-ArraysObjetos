package ejercicio2y3;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // tamaño del array
        System.out.print("Ingrese el número de artículos a almacenar: ");
        int tamaño = entrada.nextInt();

        PruebaArticulo almacen = new PruebaArticulo(tamaño);

        // agregar articulos al array
        for (int i = 0; i < tamaño; i++) {
            entrada.nextLine();
            System.out.println("Ingrese los datos del artículo " + (i + 1) + ":");
            System.out.print("Código: ");
            String codigo = entrada.nextLine();
            System.out.print("Descripción: ");
            String descripcion = entrada.nextLine();
            System.out.print("Precio de compra: ");
            double precioCompra = entrada.nextDouble();
            System.out.print("Precio de venta: ");
            double precioVenta = entrada.nextDouble();
            System.out.print("Stock: ");
            int stock = entrada.nextInt();

            Articulo articulo = new Articulo(codigo, descripcion,precioCompra,precioVenta,stock);

            if (almacen.almacena(articulo)) {
                System.out.println("Artículo almacenado correctamente.\n");
            } else {
                System.out.println("No se pudo almacenar el artículo, el array está lleno.\n");
            }
        }
        // imprimir(no entiendo porque va)
        System.out.println(almacen);
        entrada.close();
    }
}