public class InteiroPositivo {
    private int valor;
    String dado;

    InteiroPositivo(int valor) {
        this.valor = valor;
    }

    InteiroPositivo(String valor) {
        this.valor = Integer.parseInt(valor);
    }

    public int getValor() {
        return this.valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    Boolean ehPrimo(){
        if (valor <= 1)
        return false;

        for (int i = 2; i < valor; i++){
            if (valor % i == 0)
                return false;
        }
        return true;
    }

    Boolean ehPositivo() {
        if(valor < 0){
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }  
        return false;
    }
}
