
import java.util.Arrays;
import java.util.List;

public class Pedido {
    private double percentualDesconto;
    private ItemPedido[] itens;
    double sum;
    double sumSemDesconto;

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

    public void apresentarResumoPedido() {
        System.out.println("----------------------------");
        System.out.println("------- RESUMO PEDIDO -------");
        List<ItemPedido> item = Arrays.asList(itens);

        for(ItemPedido itens : item){
            sum += (itens.getProduto().obterPrecoLiquido() * itens.getQuantidade()) - (itens.getProduto().obterPrecoLiquido() * itens.getQuantidade() * getPercentualDesconto() /100);
            sumSemDesconto += itens.getProduto().obterPrecoLiquido() * itens.getQuantidade();
            System.out.printf("Tipo: %s  Titulo: %s  Preco: %.2f  Quant: %d  Total: %.2f", itens.getProduto().getClass().getSimpleName(), 
                itens.getProduto().getTitulo(), itens.getProduto().obterPrecoLiquido(), itens.getQuantidade(), sum);
            System.out.println();
        }
        System.out.println("----------------------------");
        System.out.printf("DESCONTO: %.2f\n", getPercentualDesconto());
        System.out.printf("TOTAL PRODUTOS: %.2f\n", sumSemDesconto);
        System.out.println("----------------------------");
        System.out.printf("TOTAL PEDIDO: %.2f\n", sum);

    }

}
