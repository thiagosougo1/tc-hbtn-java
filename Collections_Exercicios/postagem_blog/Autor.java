
public class Autor {

    String nome;
    String sobrenome;

    public Autor(String nome, String sobrenome) {
        setNome(nome);
        setSobrenome(sobrenome);   
        toString();
    }

    @Override
    public String toString(){
        return nome + " " + sobrenome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    
}
