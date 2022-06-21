import comida.Comida;
import humor.Feliz;
import humor.Humor;
import humor.Irritado;
import humor.MuitoFeliz;
import humor.Triste;

public class Personagem {

    Personagem(){
    }   

    public Humor obterHumorAtual(){
        if(Comida.getPontosDeFelicidade() < -5){
            Irritado irritado = new Irritado();
            return irritado;
        } else if(Comida.getPontosDeFelicidade() >= -5 && Comida.getPontosDeFelicidade() <= 0){
            Triste triste = new Triste();
            return triste;
        } else if(Comida.getPontosDeFelicidade() > 0 && Comida.getPontosDeFelicidade() < 15 ){
            Feliz feliz = new Feliz();
            return feliz;
        } else if(Comida.getPontosDeFelicidade() > 15){
            MuitoFeliz muitoFeliz = new MuitoFeliz();;
            return muitoFeliz;
        }
        return null;
    }

    public void comer(Comida[] comidas){
         
    }

    @Override
    public String toString(){
        return Comida.getPontosDeFelicidade() + " - " + obterHumorAtual().getClass().getName(); 
    }
}
