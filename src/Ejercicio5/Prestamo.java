package Ejercicio5;

public class Prestamo {
    String fechaPrestamo;
    String fechaDevolucion;
    Libro libro;
    Cliente cliente;
    static int totalPrestamos;
    public Prestamo(String feP, String feD, Libro lib, Cliente cli){
        this.cliente = cli;
        this.libro = lib;
        this.fechaDevolucion = feD;
        this.fechaPrestamo = feP;
        totalPrestamos++;
    }
    @Override 
    public String toString(){
        String resultado = "Libro prestado: "+this.libro+" el dia "+this.fechaPrestamo+
                            "\nal cliente "+this.cliente+" que lo devuelve el "+fechaDevolucion;

        return resultado;
    }
}
