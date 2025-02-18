package Ejercicio5;

public class Cliente {
    String nombre;
    String dni;
    public Cliente(String nom, String dni){
        this.nombre = nom;
        this.dni = dni;
    }
    @Override
    public String toString(){
        String resultado = this.nombre;
        return resultado;
    }
}
