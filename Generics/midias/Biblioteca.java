import java.util.*;

public class Biblioteca<T> {
    T coisa;
    private List<T> valores = new ArrayList<>();

    public Biblioteca(T coisa, List<T> valores) {
        this.coisa = coisa;
        this.valores = valores;
    }

    public void adicionarMidia(T tipo) {

        valores.add(tipo);
    }

    public List<T> obterListaMidias() {
        return valores;
    }
}
