package biblioteca;

public class Prestamo {
    String fechaPrestamo;
    String fechaDevolucion;
    Libro libro;
    Cliente cliente;
    static int totalPrestamos;

    public Prestamo(String feP, String feD, Libro lib, Cliente cli) {
        this.cliente = cli;
        this.libro = lib;
        this.fechaDevolucion = feD;
        this.fechaPrestamo = feP;
        totalPrestamos++;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public Libro getLibro() {
        return libro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public static int getTotalPrestamos() {
        return totalPrestamos;
    }

    @Override
    public String toString() {
        return "👤 Cliente: " + cliente.getNombre()+
                "\n📖 Libro prestado: " + libro.getTitulo() +
                "\n📅 Fecha de préstamo: " + fechaPrestamo +
                "\n📅 Fecha de devolución: " + fechaDevolucion;
    }
}
