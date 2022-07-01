package blog;

import java.util.*;

public class Blog {
    private List<Post> postagens;
    List<String> categoria = new ArrayList<>();
    public Blog(){
        postagens = new ArrayList<>();     
    }

    public void adicionarPostagem(Post postagem) {
        if(postagem != null) {
            postagens.add(postagem);
        }
    }

    public Set<String> obterTodosAutores() {    
        Set<String> autores = new TreeSet<>();
        for(Post posts : postagens){
            autores.add(posts.getAutor());

        }
        return autores;
    }

    public Map<String, Integer> obterContagemPorCategoria() {
        Map<String, Integer> categorias = new TreeMap<>();

        for(Post posts : postagens){
            categoria.add(posts.getCategoria());
            categorias.put(posts.getCategoria(), Collections.frequency(categoria, posts.getCategoria()));
        }
        return categorias;
    }
    
}
