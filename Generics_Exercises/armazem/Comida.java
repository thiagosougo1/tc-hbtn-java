public class Comida {
    private String nome;
    private double calorias;
    private double preco;
    

    public Comida(String nome, double calorias, double preco) {
        setNome(nome);
        setCalorias(calorias);
        setPreco(preco);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCalorias() {
        return this.calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString(){
        return String.format("[%s] %f R$ %.6f", getNome(), getCalorias(), getPreco());
    }
}
