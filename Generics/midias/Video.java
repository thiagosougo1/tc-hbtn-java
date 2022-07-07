public class Video extends Midia {

    private int duracao;
    
    public Video(String nome, int duracao) {
        super(nome);
        setDuracao(duracao);
    }

    public int getDuracao() {
        return this.duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    
}
