package workflow;

public class Mensagem {
    String texto;
    TipoMensagem tipoMensagem;

    public Mensagem(String texto, TipoMensagem tipoMensagem) {
        setTexto(texto);
        setTipoMensagem(tipoMensagem);
    }

    public String getTexto() {
        return this.texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public TipoMensagem getTipoMensagem() {
        return this.tipoMensagem;
    }

    public void setTipoMensagem(TipoMensagem tipoMensagem) {
        this.tipoMensagem = tipoMensagem;
    }

}
