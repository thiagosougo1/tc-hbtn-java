public class ArmazemDeComida<T> extends Armazem<Comida>{
    @SuppressWarnings("unchecked")

    @Override
    public Comida obterDoInventario(String nome){
        return itensArmazenados.get(nome);
    }
}
