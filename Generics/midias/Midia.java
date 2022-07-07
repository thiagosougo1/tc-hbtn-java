public class Midia {
    String nome;

    public Midia(String nome) {
        setNome(nome);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString(){
        return String.format("Tipo %s - Nome: %s", this.getClass().getName(), getNome());
    }

}
