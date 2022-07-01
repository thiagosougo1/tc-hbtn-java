
import java.util.*;

public class Blog {
    private List<Post> postagens;
    Set<Autor> autores = new TreeSet<>();
    List<String> categoria = new ArrayList<>();
    Map<Categorias, Integer> categorias = new TreeMap<>();

    public void adicionarPostagem(Post postagem) {
        postagens = new ArrayList<>(List.of(postagem));     
    }

    public Set<Autor> obterTodosAutores() {    
        return autores;
    }

    public Map<Categorias, Integer> obterContagemPorCategoria() {
        return categorias;
    }

    public Set<Post> obterPostsPorAutor(Autor autor){
        return null;
    }

    public Set<Post> obterPostsPorCategoria(Categorias categoria){
        return null;
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
        return null;
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
        return null;
    }

    
}
