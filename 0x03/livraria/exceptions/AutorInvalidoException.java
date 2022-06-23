package livraria.exceptions;

public class AutorInvalidoException extends Exception{
    public AutorInvalidoException(String mensagem){
        System.out.println(mensagem);
    }
}
