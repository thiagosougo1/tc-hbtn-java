package TiposPrimitivos_Wrapper.inteiro_positivo;

public class InteiroPositivo {
    int valor;
    
    InteiroPositivo(int valor){
        Object x = valor;
        this.valor = (int) x;
    }

    Object getValor(){
        return valor;
    }
    public void setValor(Object valor) {
        Integer inteiro = (Integer) valor;
        this.valor = inteiro;
    }
    
    Boolean ehPrimo(){
        return true;
    }

    String getMessage(){
        return "Valor nao eh um valor inteiro positivo";
    }
}
