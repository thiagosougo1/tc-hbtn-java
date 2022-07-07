import java.util.*;

public class Armazem<T> extends Armazenavel {
    Map<String, T> itensArmazenados = new TreeMap<String, T>();

    @SuppressWarnings("unchecked")
    @Override
    public void adicionarAoInventario(String nome, Object valor){
        itensArmazenados.put(nome, (T) valor);
    }

    @Override
    public T obterDoInventario(String nome){
        return itensArmazenados.get(nome);
    }
}
