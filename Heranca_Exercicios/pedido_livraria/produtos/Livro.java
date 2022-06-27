public class Livro extends Produto{
    private int paginas;
    private String autor;
    private int edicao;

    public Livro(int paginas, String autor, int edicao) {
        this.paginas = paginas;
        this.autor = autor;
        this.edicao = edicao;
    }
    
    @Override
    public double obterPrecoLiquido(){
        return 1;
    }
}
