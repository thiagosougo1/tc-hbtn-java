package blog;

import java.util.*;

public class Blog {
    private List<Post> postagens;
    Set<String> autores = new TreeSet<>();
    List<String> categoria = new ArrayList<>();
    Map<String, Integer> categorias = new TreeMap<>();

    public void adicionarPostagem(Post postagem) {
        postagens = new ArrayList<>(List.of(postagem));     

        for(Post posts : postagens){
            autores.add(posts.getAutor());
            categoria.add(posts.getCategoria());
            categorias.put(posts.getCategoria(), Collections.frequency(categoria, posts.getCategoria()));
        }
    }

    public Set<String> obterTodosAutores() {    
        return autores;
    }

    public Map<String, Integer> obterContagemPorCategoria() {
        return categorias;
    }
    
}
