package cookies;

public class PedidoCookie {
    String sabor;
    int quantidadeCaixas;

    public PedidoCookie(String sabor, int quantidadeCaixas) {
        setSabor(sabor);
        setQuantidadeCaixas(quantidadeCaixas);
    }

    public String getSabor() {
        return this.sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public int getQuantidadeCaixas() {
        return this.quantidadeCaixas;
    }

    public void setQuantidadeCaixas(int quantidadeCaixas) {
        this.quantidadeCaixas = quantidadeCaixas;
    }    
}
