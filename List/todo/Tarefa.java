package todo;

public class Tarefa {
    String descricao;
    boolean estahFeita;
    int identificador;

    public Tarefa(String descricao, int identificador) {
        modificarDescricao(descricao);
        setIdentificador(identificador);
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void modificarDescricao(String descricao) {
        if(descricao != null && descricao != ""){
            this.descricao = descricao;
        } else throw new IllegalArgumentException("Descricao de tarefa invalida");
    }

    public boolean getEstahFeita() {
        return this.estahFeita;
    }

    public void setEstahFeita(boolean estahFeita) {
        this.estahFeita = estahFeita;
    }

    public int getIdentificador() {
        return this.identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

}
