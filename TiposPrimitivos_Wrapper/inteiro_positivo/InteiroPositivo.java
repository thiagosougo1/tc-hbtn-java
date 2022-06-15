package TiposPrimitivos_Wrapper.inteiro_positivo;

public class InteiroPositivo {
    String valor;
    public InteiroPositivo(String valor){
        this.valor = valor;
    }

    String getValor(){
        return valor;
    }

    Boolean ehPrimo(){
        return true;
    }
}
