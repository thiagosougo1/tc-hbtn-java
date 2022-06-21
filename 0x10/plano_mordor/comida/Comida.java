package comida;

public abstract class Comida{
    protected static int pontosDeFelicidade;

    public Comida(int pontosDeFelicidade) {
        setPontosDeFelicidade(pontosDeFelicidade);
    }

    public static int getPontosDeFelicidade() {
        return Comida.pontosDeFelicidade;
    }

    public void setPontosDeFelicidade(int pontosDeFelicidade) {
        this.pontosDeFelicidade = pontosDeFelicidade;
    }
}