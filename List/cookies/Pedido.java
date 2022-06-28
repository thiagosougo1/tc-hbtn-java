package cookies;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Pedido {
    ArrayList<PedidoCookie> cookies = new ArrayList<>();
    int soma;

    public void adicionarPedidoCookie(PedidoCookie pedidoCookie) {
        cookies.add(pedidoCookie);
    }

    public Object obterTotalCaixas() {
        for(PedidoCookie pedido : cookies){
            soma += pedido.getQuantidadeCaixas();
        }
        return soma;
    }

    public int removerSabor(String sabor) {
        int tam = cookies.size();
        cookies.remove(sabor);
        return tam;
    }
    
}
