package livraria;

public class LivroEdicaoOuro extends Livro{

    public LivroEdicaoOuro(String titulo, String autor, double preco) throws Exception {
        super(titulo, autor, preco);
    }
    
    public double getPreco() {
        return this.preco*0.3 + preco;
    }

}
