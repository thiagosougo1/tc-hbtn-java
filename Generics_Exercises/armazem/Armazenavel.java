public interface Armazenavel<T> {

    public void adicionarAoInventario(String nome, T coisa);

    public T obterDoInventario(String nome);
}
