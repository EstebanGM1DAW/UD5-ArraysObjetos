package biblioteca;

public class Libro {
    String codigo;
    String titulo;
    Autor autor;
    static int numLibros;

    public Libro(String cod, String tit, Autor au){
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

    public Autor getAutor(){
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
