import java.util.*;

public class ConsultaProdutos {
    public static List<Produto> filtrar(List<Produto> produtos, CriterioFiltro criterioFiltro){
        List<Produto> lista = new ArrayList<>();

        produtos.forEach(produto -> {
            if(criterioFiltro.testar(produto)){
                lista.add(produto);
            }
        });

        return lista;
    }
}
