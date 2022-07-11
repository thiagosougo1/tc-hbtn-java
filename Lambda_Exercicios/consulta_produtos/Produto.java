public class Produto {
    private String nome;
    private double preco;
    private double peso;
    private int quantidadeEmEstoque;
    private TiposProduto tipo;


    public Produto(String nome, double preco, double peso, int quantidadeEmEstoque, TiposProduto tipo) {
        setNome(nome);
        setPreco(preco);
        setPeso(peso);
        setQuantidadeEmEstoque(quantidadeEmEstoque);
        setTipo(tipo);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getQuantidadeEmEstoque() {
        return this.quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public TiposProduto getTipo() {
        return this.tipo;
    }

    public void setTipo(TiposProduto tipo) {
        this.tipo = tipo;
    }

    public String toString(){
        return String.format("%s %f %f %d %s", getNome(), getPreco(), getPeso(), getQuantidadeEmEstoque(), getTipo());
    }
}
