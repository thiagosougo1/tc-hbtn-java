
import exceptions.OperacaoInvalidaException;

public class ContaBancariaBasica {
    String numeracao;
    double saldo = 0;
    double taxaJurosAnual;

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        setNumeracao(numeracao);
        setTaxaJurosAnual(taxaJurosAnual);
    }

    public String getNumeracao() {
        return this.numeracao;
    }

    public void setNumeracao(String numeracao) {
        this.numeracao = numeracao;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTaxaJurosAnual() {
        return this.taxaJurosAnual;
    }

    public void setTaxaJurosAnual(double taxaJurosAnual) {
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public void depositar(double valor){
        if(valor > 0)
            setSaldo(valor + getSaldo());

    }

    public void sacar(double valor){
        setSaldo(getSaldo() - valor);
    }

    public double calcularTarifaMensal(){return 1;}

    public double calcularJurosMensal(){return 1;}

    public void aplicarAtualizacaoMensal(){}

}
