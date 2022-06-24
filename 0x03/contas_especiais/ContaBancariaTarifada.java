import exceptions.OperacaoInvalidaException;

public class ContaBancariaTarifada extends ContaBancariaBasica{
    private int quantidadeTransacoes;
    
    public ContaBancariaTarifada(String numeracao, double taxaJurosAnual) {
        super(numeracao, taxaJurosAnual);
    }

    @Override    
    public void depositar(double valor) throws OperacaoInvalidaException, Exception{
        if(valor > 0)
            setSaldo(valor + getSaldo() - 0.1);
            else 
                throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
    }

    @Override
    public void sacar(double valor) throws OperacaoInvalidaException, Exception{
        if(valor <= getSaldo())
            setSaldo(getSaldo() - valor - 0.1);
        else
           throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        }

}
