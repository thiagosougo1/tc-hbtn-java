
public class Post implements Comparable<Post>{    
    private Autor autor;
    private String titulo;
    private String corpo;
    private Categorias categoria;

    public Post(Autor autor, String titulo, String corpo, Categorias categoria) {
        setAutor(autor);
        setTitulo(titulo);
        setCorpo(corpo);
        setCategoria(categoria);
    }

    public Autor getAutor(){
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getcorpo() {
        return this.corpo;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }

    public Categorias getCategoria(){
        return categoria;
    }

    public void setCategoria(Categorias categoria){
        this.categoria = categoria;
    }

    @Override
    public String toString(){
        return titulo;
    }

    @Override
    public int compareTo(Post postagem) {
        return toString().compareTo(postagem.toString());
    }
    
}
