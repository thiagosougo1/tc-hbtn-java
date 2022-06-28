import produtos.Produto;

public class ItemPedido {
    private int quantidade;
    private Produto produto;

    public ItemPedido(Produto produto, int quantidade) {
        setQuantidade(quantidade);
        setProduto(produto);
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return this.produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

}
