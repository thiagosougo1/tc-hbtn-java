package conta_basica.exceptions;

public class OperacaoInvalidaException extends Exception{
    public OperacaoInvalidaException(String mensagem) throws Exception{
        throw new Exception(mensagem);
    }
}
