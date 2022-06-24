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

    public void depositar(double valor) throws OperacaoInvalidaException, Exception{
        if(valor > 0)
            setSaldo(valor + getSaldo());
            else 
                throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
    }

    public void sacar(double valor) throws OperacaoInvalidaException, Exception{
        if(valor <= getSaldo())
            setSaldo(getSaldo() - valor);
        else
           throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        }

    public double calcularTarifaMensal(){
        if(getSaldo() * 0.1 <= 10){
            return getSaldo() * 0.1;
        } else return 10;
    }

    public double calcularJurosMensal(){
        if(getSaldo() <= 0)
            return 0;
        else
          return taxaJurosAnual /= 12;
    }

    public void aplicarAtualizacaoMensal(){
        setSaldo(getSaldo() - calcularTarifaMensal() + calcularJurosMensal());
    }

}
