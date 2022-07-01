

import java.util.*;

public class Blog {
    private ArrayList<Post> postagens;
    List<String> categoria = new ArrayList<>();

    public Blog(){
        postagens = new ArrayList<Post>();     
    }

    public void adicionarPostagem(Post postagem) {

		for (Post post : postagens) {
			if (post.getAutor().equals(postagem.getAutor()) && post.getTitulo().contains(postagem.getTitulo())) {
				throw new IllegalArgumentException("Postagem jah existente");
			}
		}
		postagens.add(postagem);
	}

    public Set<Autor> obterTodosAutores() {    
        Set<Autor> autores = new TreeSet<>();
        postagens.forEach(x -> autores.add(x.getAutor()));
        
        return autores;
    }

    public Map<Categorias, Integer> obterContagemPorCategoria() {
        Map<Categorias, Integer> categorias = new TreeMap<>();
        List<Categorias> lista = new ArrayList<>();

        postagens.forEach(x -> lista.add(x.getCategoria()));
        
        postagens.forEach(x -> categorias.put(x.getCategoria(), Collections.frequency(lista, x.getCategoria())));
        return categorias;
    }

    public Set<Post> obterPostsPorAutor(Autor autor) {
		Set<Post> postAutor = new TreeSet<>();
		postagens.sort(Comparator.comparing(Post::getTitulo));

		postagens.forEach(post -> {
			if (post.getAutor().equals(autor)) {
				postAutor.add(post);
			}
		});

		return postAutor;
	}

    public Set<Post> obterPostsPorCategoria(Categorias categoria) {
		Set<Post> categoriasPost = new TreeSet<>();
		postagens.sort(Comparator.comparing(Post::getTitulo));

		postagens.forEach(post -> {
			if (post.getCategoria().equals(categoria)) {
				categoriasPost.add(post);
			}
		});

		return categoriasPost;
	}

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
		Map<Categorias, Set<Post>> todosPosts = new TreeMap<>();
		for (Post post : postagens) {
			Set<Post> postagem;
			if (todosPosts.containsKey(post.getCategoria())) {
				postagem = todosPosts.get(post.getCategoria());
			} else {
				postagem = new TreeSet<>();
			}

			postagem.add(post);
			todosPosts.put(post.getCategoria(), postagem);
		}

		return todosPosts;

	}

  
	public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
		Map<Autor, Set<Post>> todosPosts = new TreeMap<>();
		for (Post post : postagens) {
			Set<Post> postagem;
			if (todosPosts.containsKey(post.getAutor())) {
				postagem = todosPosts.get(post.getAutor());
			} else {
				postagem = new TreeSet<>();
			}

			postagem.add(post);
			todosPosts.put(post.getAutor(), postagem);
		}

		return todosPosts;
	}

    
}
