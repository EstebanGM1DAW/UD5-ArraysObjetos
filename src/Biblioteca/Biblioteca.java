package Biblioteca;

public class Biblioteca {
    public static void main(String[] args) {
        Libro l1 = new Libro("L001", "Jeronimo Stilton", "Lolito Fernandez");
        Libro l2 = new Libro("L002", "3000 leguas bajo el agua", "Pereira");
        Libro l3 = new Libro("L003", "Don Quijote", "El pana Miguel");
        Libro l4 = new Libro("L004", "Vengadores", "Marvel");
        Libro l5 = new Libro("L005", "Vuelta al mundo en 80 dias", "Fran Luque");
        Libro l6 = new Libro("L006", "Spider-man #3", "Stan Lee");
        Autor a1 = new Autor("Estadounidense", "Stan Lee");
        Autor a2 = new Autor("Colombiana", "Fran Luque");
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);
        System.out.println(l5);
        System.out.println(l6);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println("Numero de libros: "+Libro.getNumLibros());
        Cliente c1 = new Cliente("Pelayo", "83246323P");
        Cliente c2 = new Cliente("Laura", "41235987A");
        Prestamo p1 = new Prestamo("18/02/2025", "18/03/2025", l4, c2);
        Prestamo p2 = new Prestamo("18/02/2025", "31/05/2025", l5, c1);
        System.out.println(p1);
        System.out.println(p2);
    }
}
