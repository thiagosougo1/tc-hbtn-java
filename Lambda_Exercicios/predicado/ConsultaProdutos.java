import java.util.*;
import java.util.function.Predicate;

public class ConsultaProdutos {
    public static List<Produto> filtrar(List<Produto> produtos, Predicate<Produto> listagem){
        List<Produto> lista = new ArrayList<>();

        produtos.forEach(produto -> {
            if(listagem.test(produto)){
                lista.add(produto);
            }
        });

        return lista;
    }
}
