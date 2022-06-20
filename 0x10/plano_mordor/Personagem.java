public class Personagem {
    int pontosDeFelicidade;

    Personagem(int pontosDeFelicidade){
        this.pontosDeFelicidade = pontosDeFelicidade;
    }   

    public Humor obterHumorAtual(){
        return Humor;
    }

    public void comer(Comida[] comidas){

    }

    @Override
    public string toString(){
        return pontosDeFelicidade + " " + obterHumorAtual().getClass().getName(); 
    }
}
