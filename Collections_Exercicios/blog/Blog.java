package blog;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Blog {
    List<Post> postagens;
    public void adicionarPostagem(Post postagem) {
       postagens = new ArrayList<>(List.of(postagem));
    }

    public Set<String> obterTodosAutores() {
        return null;
    }

    public Map<String, Integer> obterContagemPorCategoria() {
        return null;
    }
    
}
