import comida.Comida;
import humor.Humor;

public class Personagem{
    public Personagem(int pontosDeFelicidade){
    }

    public Humor obterHumorAtual(){
        return null;
    }

    public void comer(Comida[] comidas){
        
    }

    @Override
    public String toString(){ 
        return Comida.pontosDeFelicidade + " - " + obterHumorAtual().getClass().getSimpleName();
    }
}