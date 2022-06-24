package conta_bancaria.exceptions;

public class OperacaoInvalidaException extends Exception{
    public OperacaoInvalidaException(String mensagem) throws Exception{
        throw new Exception(mensagem);
    }
}
