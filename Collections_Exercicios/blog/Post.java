package blog;

public class Post {
    String autor;
    String titulo;
    String corpo;
    String categoria;
  
    public Post(String autor, String titulo, String corpo, String categoria) {
        setAutor(autor);
        setTitulo(titulo);
        setCorpo(corpo);
        setCategoria(categoria);
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCorpo() {
        return this.corpo;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}