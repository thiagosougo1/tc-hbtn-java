
import exceptions.*;
public class Livro {
    String titulo;
    String autor;
    double preco;


    public Livro(String titulo, String autor, double preco) throws Exception {
        setTitulo(titulo);
        setAutor(autor);
        setPreco(preco);
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) throws Exception {
        if(titulo.length() > 3)
            this.titulo = titulo;
        else
            throw new LivroInvalidoException("Titulo de livro invalido");
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) throws Exception  {
        if(autor.contains(" "))
          this.autor = autor;
          else
            throw new AutorInvalidoException("Nome de autor invalido");
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) throws Exception {
        if(preco > 0)
            this.preco = preco;
        else 
            throw new LivroInvalidoException("Preco de livro invalido");
    }

}
