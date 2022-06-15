package TiposPrimitivos_Wrapper.inteiro_positivo;

public class InteiroPositivo {
    int valor;
    
    InteiroPositivo(int valor){
        this.valor = valor;
    }

    String getValor(){
        return valor;
    }
    public void setValor(int valor) {
        Integer inteiro = new Integer(valor);
        this.valor = inteiro;
    }
    
    Boolean ehPrimo(){
        return true;
    }
}
