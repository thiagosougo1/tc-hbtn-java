package cookies;

import java.util.ArrayList;
import java.util.Iterator;

public class Pedido {
    static ArrayList<PedidoCookie> cookies;

    public Pedido(){
        cookies = new ArrayList<>();
    }
    public void adicionarPedidoCookie(PedidoCookie pedidoCookie) {
        cookies.add(pedidoCookie);
    }

    static public int obterTotalCaixas() {
        int soma = 0;
        for(PedidoCookie pedido : cookies){
            soma += pedido.getQuantidadeCaixas();            
        }
        return soma;
    }

    public int removerSabor(String sabor) {
       
        int total = 0 ;

        Iterator<PedidoCookie> iterator = cookies.iterator();
        while (iterator.hasNext()) {
            PedidoCookie pedidoCookie = iterator.next();
            if (pedidoCookie.getSabor().equalsIgnoreCase(sabor)){
                total += pedidoCookie.getQuantidadeCaixas() ;
                iterator.remove();
            }

        }
        return total ;

    }
    
}
