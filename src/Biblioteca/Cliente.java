package biblioteca;

public class Cliente {
    String nombre;
    String dni;
    public Cliente(String nom, String dni){
        this.nombre = nom;
        this.dni = dni;
    }
    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Cliente: " + nombre + " | DNI: " + dni;
    }
}
