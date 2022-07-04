
import java.util.*;

public class Celular {

    ArrayList<Contato> contatos = new ArrayList<Contato>();

    public int obterPosicaoContato(String nomeContato){
        for(Contato contato : contatos){
            if(contato.getNome().equals(nomeContato)){
                return contatos.indexOf(contato);
            }
        }
        return -1;
    }
    
    public void adicionarContato(Contato contato)   {
        if(obterPosicaoContato(contato.getNome()) == -1)
            contatos.add(contato);
        else
            throw new IllegalArgumentException("Nao foi possivel adicionar contato. Contato jah existente com esse nome.");
    }

   
    public void atualizarContato(Contato contatoAntigo, Contato novoContato)  {
        int posicaoAntigo = obterPosicaoContato(contatoAntigo.getNome());
        int posicaoNovo = obterPosicaoContato(novoContato.getNome());

        if (posicaoAntigo < 0 ){
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato nao existe");
        }
        if (posicaoNovo != -1 && posicaoAntigo != posicaoNovo){
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato jah existente com esse nome");
        }

        contatos.set(posicaoNovo, novoContato);
    }

    public void removerContato(Contato contato)  {
        int posicaoContato = obterPosicaoContato(contato.getNome());
        if(posicaoContato != -1){
            contatos.remove(posicaoContato);
        }else
            throw new IllegalArgumentException("Nao foi possivel remover contato. Contato nao existe");

    }

    public void listarContatos() {
        contatos.forEach(x -> System.out.println(x.getNome() + " -> " + x.getNumeroDeTelefone() + " (" + x.getTipoNumero() + ")"));
    }    
}
