package telefones;

import java.util.ArrayList;
import java.util.HashMap;

public class ListaTelefonica {
    HashMap<String, Integer> telefones;

    public ListaTelefonica(){
        telefones = new HashMap<>();
    }

    public void adicionarTelefone(String nome, Telefone telefone) {
    }

    public ArrayList<Telefone> buscar(String nome) {
        telefones.containsValue(nome);
        return null;
    }
 
}
