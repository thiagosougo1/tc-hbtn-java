package TiposPrimitivos_Wrapper.inteiro_positivo;
public class InteiroPositivo {
    private int valor;
    String dado;

    InteiroPositivo(int valor) {
        if(valor > 0)
            this.valor = valor;
        else
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");

    }

    InteiroPositivo(String valor) {
        int num = Integer.parseInt(valor);
        if(num > 0)
            this.valor = num;
        else
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");

    }

    public int getValor() {
        return this.valor;
    }

    public void setValor(int valor) {
        if(valor > 0)
        this.valor = valor;
    else
        throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");    }

    Boolean ehPrimo(){
        if (valor <= 1)
        return false;

        for (int i = 2; i < valor; i++){
            if (valor % i == 0)
                return false;
        }
        return true;
    }
}
