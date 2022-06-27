public class Dvd extends Produto{
    private String diretor;
    private String genero;
    private int duracao;

    public Dvd(String diretor, String genero, int duracao) {
        this.diretor = diretor;
        this.genero = genero;
        this.duracao = duracao;
    }

     
    @Override
    public double obterPrecoLiquido(){
        return 1;
    }

}
