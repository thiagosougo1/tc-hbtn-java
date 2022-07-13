import java.util.*;
import java.util.stream.Collector;
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
        List<Pedido> eletronico = listaPedidos.stream()
            .filter(p -> {
                return p.getProdutos().stream().anyMatch(q -> q.getCategoria().equals(CategoriaProduto.ELETRONICO));
        }).collect(Collectors.toList());

        return eletronico;
    }
    
    public static List<Produto> aplicar15PorcentoDescontoEletronicos(List<Produto> listaProduto){
        listaProduto.stream()
            .forEach(p -> {
                if(p.getCategoria().equals(CategoriaProduto.ELETRONICO)){
                    double desconto = p.getPreco() - (p.getPreco() * 0.15);
                    p.setPreco(desconto);
                };
            });
        return listaProduto;
    }
}