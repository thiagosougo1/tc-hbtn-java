package TiposPrimitivos_Wrapper.inteiro_positivo;

public class InteiroPositivo {
    private int valor;
    
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
        for(int i = 2; i < valor; i++){
            for (int j = 2; j < valor; j++) {
                if (valor % j == 0)
                    return false;   
            }
        }
        return true;
    }

    String ehInteiro(){
        if(valor < 0)
            return "Valor nao eh um valor inteiro positivo";
        return "";
    }
}
