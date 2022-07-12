import java.util.*;

public class Pedido {
    private int codigo;
    private List<Produto> produto;
    private Cliente cliente;

    public Pedido(int codigo, List<Produto> produto, Cliente cliente) {
        setCodigo(codigo);
        setProduto(produto);
        setCliente(cliente);
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public List<Produto> getProdutos() {
        return this.produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    } 

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
