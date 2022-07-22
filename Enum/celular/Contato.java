package celular;

public class Contato {
    String nome;
    String numeroDeTelefone;
    TipoNumero tipoNumero;

    public Contato(String nome, String numeroDeTelefone, TipoNumero tipoNumero) {
        setNome(nome);
        setNumeroDeTelefone(numeroDeTelefone);
        setTipoNumero(tipoNumero);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroDeTelefone() {
        return this.numeroDeTelefone;
    }

    public void setNumeroDeTelefone(String numeroDeTelefone) {
        this.numeroDeTelefone = numeroDeTelefone;
    }

    public TipoNumero getTipoNumero() {
        return this.tipoNumero;
    }

    public void setTipoNumero(TipoNumero tipoNumero) {
        this.tipoNumero = tipoNumero;
    }
    
}
