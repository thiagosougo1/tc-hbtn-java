import java.util.*;

public class Biblioteca<T> extends Midia{

    private List<T> lista = new ArrayList<>();

    public void adicionarMidia(T tipo) {

        lista.add(tipo);
    }

    public List<T> obterListaMidias() {
        return lista;
    }
}