import java.util.*;

public class Biblioteca<T> {
    T coisa;
    List<T> valores = new ArrayList<>();

    public void adicionarMidia(T tipo) {

        valores.add(tipo);
    }

    public List<T> obterListaMidias() {
        return valores;
    }
}
