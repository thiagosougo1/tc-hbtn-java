import java.util.*;
import java.util.function.*;

public class Produto {
    private String nome;   
    private double preco;   
    private double percentualMarkup = 0.1;   

    public Produto(double preco, String nome) {
        setNome(nome);
        setPreco(preco);
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

    public double getPercentualMarkup() {
        return this.percentualMarkup;
    }

    public void setPercentualMarkup(double percentualMarkup) {
        this.percentualMarkup = percentualMarkup;
    }

    Supplier<Double> precoComMarkup = () -> preco + (preco * percentualMarkup);
    Consumer<Double> atualizarMarkup = (c) -> setPercentualMarkup(c / 100);
}
