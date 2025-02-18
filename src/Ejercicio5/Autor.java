package Ejercicio5;

public class Autor {
    String nacionalidad;
    String nombre;
    static int numAutores;

    public Autor(String nac, String nom) {
        this.nacionalidad = nac;
        this.nombre = nom;
        numAutores++;
    }
    @Override
    public String toString(){
        String resultado = "Autor: "+this.nombre+" con nacionalidad: "+this.nacionalidad;
        return resultado;
    }
}
