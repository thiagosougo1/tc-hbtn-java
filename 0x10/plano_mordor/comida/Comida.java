package plano_mordor.comida;

public abstract class Comida {
    protected int pontosDeFelicidade;
 
    public Comida(int pontosDeFelicidade) {
        setPontosDeFelicidade(pontosDeFelicidade);
    }

    public int getPontosDeFelicidade() {
        return this.pontosDeFelicidade;
    }

    public void setPontosDeFelicidade(int pontosDeFelicidade) {
        this.pontosDeFelicidade = pontosDeFelicidade;
    }
}
