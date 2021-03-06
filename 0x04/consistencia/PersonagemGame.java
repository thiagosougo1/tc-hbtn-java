
public class PersonagemGame {
    private int saudeAtual;
    private String nome;
    private String status;

    public PersonagemGame(int saudeAtual, String nome) {
        setSaudeAtual(saudeAtual);
        this.nome = nome;
    }

    public int getSaudeAtual() {
        return this.saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
        if(saudeAtual > 0)
            status = "vivo";
        else 
            status = "morto";
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if(nome != null && nome != ""){
            this.nome = nome;
        }
    }
    
    public void tomarDano(int quantidadeDeDano){
        saudeAtual -= quantidadeDeDano;
        setSaudeAtual(saudeAtual);
        if(saudeAtual < 0)
            setSaudeAtual(0);;
    }

    public void receberCura(int quantidadeDeCura){
        saudeAtual += quantidadeDeCura;
        setSaudeAtual(saudeAtual);
        int sub;
        if(saudeAtual > 100){
            sub = saudeAtual - 100;
            saudeAtual -= sub;
            setSaudeAtual(saudeAtual);
        }
    }

    public String getStatus(){
        return this.status;
    }
}
