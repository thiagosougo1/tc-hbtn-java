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

    public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> lista, double preco){
        return lista.stream()
            .filter(p-> p.getPreco() >= preco)
            .collect(Collectors.toList());
    }

    public static List<Pedido> obterPedidosComEletronicos(List<Pedido> listaPedidos){
        return listaPedidos.stream().filter(c -> c.equals(CategoriaProduto.ELETRONICO)).collect(Collectors.toList());
    }
}