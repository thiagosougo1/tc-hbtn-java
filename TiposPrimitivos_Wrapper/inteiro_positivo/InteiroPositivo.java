package TiposPrimitivos_Wrapper.inteiro_positivo;

public class InteiroPositivo {
    private int valor;
    Object dado = new Object();
    
    InteiroPositivo(Object dado){
        this.valor = (int) dado;
    }

    Object getValor(){
        return valor;
    }
    public void setValor(Object dado) {
        this.valor = (int) dado;
        System.out.println("Valor: " + valor);
        System.out.println("Dado: " + dado);
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

    Boolean ehInteiro(){
        if(valor < 0)
            return false;
        return true;
    }
}
