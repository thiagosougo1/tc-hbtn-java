package exceptions;

public class AutorInvalidoException extends Exception{
    public AutorInvalidoException(String mensagem) throws Exception{
        throw new Exception(mensagem);
    }
}