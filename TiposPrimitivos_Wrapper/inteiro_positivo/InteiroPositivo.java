package TiposPrimitivos_Wrapper.inteiro_positivo;

public class InteiroPositivo {
    int valor;
    
    InteiroPositivo(int valor){
        this.valor = valor;
    }

    String getValor(){
        return valor;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }
    
    Boolean ehPrimo(){
        return true;
    }
}
