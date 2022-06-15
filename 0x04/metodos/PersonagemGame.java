package metodos;

public class PersonagemGame {
    private int saudeAtual;
    private String nome;

    public PersonagemGame() {
        this.saudeAtual = saudeAtual;
        this.nome = nome;
    }

    public int getSaudeAtual() {
        return this.saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void tomarDano(int quantidadeDeDano){
        saudeAtual -= quantidadeDeDano;
        if(saudeAtual < 0)
            saudeAtual = 0;
    }

    public void receberCura(int quantidadeDeCura){
        saudeAtual += quantidadeDeCura;
        int sub;
        if(saudeAtual > 100){
            sub = saudeAtual - 100;
            saudeAtual -= sub;
        }
    }
}
