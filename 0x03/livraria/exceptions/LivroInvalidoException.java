package livraria.exceptions;

public class LivroInvalidoException extends Exception{
    public LivroInvalidoException(String mensagem) throws Exception{
        throw new Exception(mensagem);
    }
}
