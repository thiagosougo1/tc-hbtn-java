

public class Post {

    String titulo;
    String subtitulo;

    public Post(Autor autor, String titulo, String subtitulo, Categorias categoria) {
        setTitulo(titulo); 
        setSubtitulo(subtitulo);  
        toString();
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubtitulo() {
        return this.subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    @Override
    public String toString(){
        return titulo;
    }
    
}
