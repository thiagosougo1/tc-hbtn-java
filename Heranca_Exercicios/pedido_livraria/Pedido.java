import java.util.Arrays;
import java.util.List;

public class Pedido {
    private double percentualDesconto;
    private ItemPedido[] itens;
    double sum;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        setPercentualDesconto(percentualDesconto);
        setItens(itens);
    }

    public double calcularTotal(){
        List<ItemPedido> item = Arrays.asList(itens);
        for(ItemPedido itens : item){
           sum += (itens.getProduto().obterPrecoLiquido() * itens.getQuantidade()) -  (itens.getProduto().obterPrecoLiquido() * itens.getQuantidade() * getPercentualDesconto() /100);
        }
        return sum;
    }

    public double getPercentualDesconto() {
        return this.percentualDesconto;
    }

    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public ItemPedido[] getItens() {
        return this.itens;
    }

    public void setItens(ItemPedido[] itens) {
        this.itens = itens;
    }

}
