package Ejercicio5;

public class Libro {
    String codigo;
    String titulo;
    String autor;
    static int numLibros;

    public Libro(String cod, String tit, String au){
        numLibros++;
        this.autor = au;
        this.titulo = tit;
        this.codigo = cod;
    }

    @Override
    public String toString(){
        String resultado = "**Código: " + this.codigo +" | Título: "+this.titulo + " | Autor: "+ this.autor+"**";
        return resultado;
    }

    public String getAutor(){
        return this.autor;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public String getCodigo(){
        return this.codigo;
    }
    static public int getNumLibros(){
        return numLibros;
    }
}
