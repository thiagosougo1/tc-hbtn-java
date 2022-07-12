import java.util.*;

public abstract class Armazem<T> implements Armazenavel<T> {
    Map<String, T> itensArmazenados = new TreeMap<String, T>();

    public Armazem(){

    }

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
