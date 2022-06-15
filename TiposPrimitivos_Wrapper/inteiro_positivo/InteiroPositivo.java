package TiposPrimitivos_Wrapper.inteiro_positivo;

public class InteiroPositivo {
    Object valor = new Object();
    
    InteiroPositivo(Object valor){
        this.valor = valor;
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
