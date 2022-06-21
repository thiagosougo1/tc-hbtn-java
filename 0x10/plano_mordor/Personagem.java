import comida.Comida;
import humor.Feliz;
import humor.Humor;
import humor.Irritado;
import humor.MuitoFeliz;
import humor.Triste;

public class Personagem {
    int pontosDeFelicidade;

    Personagem(){
    }   

    public Humor obterHumorAtual(){
        if(pontosDeFelicidade < -5){
            Irritado irritado = new Irritado();
            return irritado;
        } else if(pontosDeFelicidade >= -5 && pontosDeFelicidade <= 0){
            Triste triste = new Triste();
            return triste;
        } else if(pontosDeFelicidade > 0 && pontosDeFelicidade < 15 ){
            Feliz feliz = new Feliz();
            return feliz;
        } else if(pontosDeFelicidade > 15){
            MuitoFeliz muitoFeliz = new MuitoFeliz();;
            return muitoFeliz;
        }
        return null;
    }

    public void comer(Comida[] comidas){
    }

    @Override
    public String toString(){
        return pontosDeFelicidade + " - " + obterHumorAtual().getClass().getName(); 
    }
}
