import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Blog {

    public void adicionarPostagem(Post postagem) {
        List<Post> postagens = new ArrayList<>(List.of(postagem));
    }

    public Set<String> obterTodosAutores() {
        return null;
    }

    public Map<String, Integer> obterContagemPorCategoria() {
        return null;
    }
    
}
