package biblioteca;

public class Biblioteca {
    public static void main(String[] args) {
        Autor a1 = new Autor("Estadounidense", "Stan Lee");
        Autor a2 = new Autor("Colombiana", "Fran Luque");
        Libro l1 = new Libro("L001", "Jeronimo Stilton", a1);
        Libro l2 = new Libro("L002", "3000 leguas bajo el agua", a1);
        Libro l3 = new Libro("L003", "Don Quijote", a2);
        Libro l4 = new Libro("L004", "Vengadores", a1);
        Libro l5 = new Libro("L005", "Vuelta al mundo en 80 dias", a2);
        Libro l6 = new Libro("L006", "Spider-man #3", a2);
        Cliente c1 = new Cliente("Pelayo", "83246323P");
        Cliente c2 = new Cliente("Laura", "41235987A");
        Prestamo p1 = new Prestamo("18/02/2025", "18/03/2025", l4, c2);
        Prestamo p2 = new Prestamo("18/02/2025", "31/05/2025", l5, c1);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);
        System.out.println(l5);
        System.out.println(l6);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println("📚 Número de libros: " + Libro.getNumLibros());
        System.out.println("🔹 Número total de préstamos: " + Prestamo.getTotalPrestamos());
        System.out.println("📌 Información de préstamos:");
        System.out.println(p1);
        System.out.println(p2);
        
    }
}
