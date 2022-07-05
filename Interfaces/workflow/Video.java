package workflow;

public class Video {
    String arquivo;
    private FormatoVideo formato;

    public Video(String arquivo, FormatoVideo formato) {
        setArquivo(arquivo);
        setFormato(formato);
    }

    public String getArquivo() {
        return this.arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }

    public FormatoVideo getFormato() {
        return this.formato;
    }

    public void setFormato(FormatoVideo formato) {
        this.formato = formato;
    }

}
