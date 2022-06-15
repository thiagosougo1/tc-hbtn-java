package TiposPrimitivos_Wrapper.inteiro_positivo;

public class InteiroPositivo {
    int valor;
    
    InteiroPositivo(Object valor){
        this.valor = (int) valor;
    }

    Object getValor(){
        return valor;
    }
    public void setValor(Object valor) {
        Integer inteiro = (Integer) valor;
        this.valor = inteiro;
    }
    
    Boolean ehPrimo(){
        for (int j = 2; j < valor; j++) {
            if (valor % j == 0)
                return false;   
        }
        return true;
    }

    String getMessage(){
        return "Valor nao eh um valor inteiro positivo";
    }
}
