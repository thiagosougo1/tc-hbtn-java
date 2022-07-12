import java.util.*;
import java.util.stream.Collectors;

public class Consulta {
    public static List<Produto> obterLivrosDoPedido(Pedido lista){
        return lista.getProdutos()
                .stream()
                .filter(p-> p.getCategoria().equals(CategoriaProduto.LIVRO))
                .collect(Collectors.toList());
    }

    public static Produto obterProdutoMaiorPreco(List<Produto> lista){

        return lista.stream().max(Comparator.comparing(Produto::getPreco)).get();

    }
}