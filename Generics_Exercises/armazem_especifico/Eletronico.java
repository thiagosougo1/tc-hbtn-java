public class Eletronico {
    private String descricao;
    private double valor;


    public Eletronico(String descricao, double valor) {
        setDescricao(descricao);
        setValor(valor);
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString(){
        return String.format("[%s] R$ %.6f", getDescricao(), getValor());
    }
}
