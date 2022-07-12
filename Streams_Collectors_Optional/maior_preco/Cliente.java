public class Cliente {
    private int codigo;
    private String nome;
    private boolean premium;

    public Cliente(int codigo, String nome, boolean premium) {
        setCodigo(codigo);
        setNome(nome);
        setPremium(premium);
    }
    
    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isPremium() {
        return this.premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

}
