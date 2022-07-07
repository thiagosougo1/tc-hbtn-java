public class ArmazemDeEletronico<T> extends Armazem<Eletronico> {

    @Override
    public Eletronico obterDoInventario(String nome){
        return itensArmazenados.get(nome);
    }
}
