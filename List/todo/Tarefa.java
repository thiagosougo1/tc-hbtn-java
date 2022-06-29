package todo;

public class Tarefa {
    String descricao;
    boolean estahFeita;
    int identificador;

    public Tarefa(String descricao, int identificador) {
        setDescricao(descricao);
        setIdentificador(identificador
);    }


    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isEstahFeita() {
        return this.estahFeita;
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
