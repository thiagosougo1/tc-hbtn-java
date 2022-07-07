public class Jornal extends Midia {
    private int quantidadeArtigos;
    
    public Jornal(String nome, int quantidadeArtigos) {
        super(nome);
        setQuantidadeArtigos(quantidadeArtigos);
    }

    public int getQuantidadeArtigos() {
        return this.quantidadeArtigos;
    }

    public void setQuantidadeArtigos(int quantidadeArtigos) {
        this.quantidadeArtigos = quantidadeArtigos;
    }

}
