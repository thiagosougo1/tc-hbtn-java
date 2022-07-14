import java.io.Serializable;

public class Estudante implements Serializable{
    private String nome;
    private int idade;
    private transient String senha;

    public Estudante(int idade, String nome, String senha) {
        setNome(nome);
        setIdade(idade);
        setSenha(senha);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString(){
        return String.format("Estudante { nome='%s', idade='%d', senha='%s' }", getNome(), getIdade(), getSenha());
    }

}
