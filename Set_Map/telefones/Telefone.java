package telefones;

public class Telefone {

    String codArea;
    String numero;
    public Telefone(String codigoArea, String numero) {
        setCodArea(codArea);
        setNumero(numero);
    }

    public String getCodArea() {
        return this.codArea;
    }

    public void setCodArea(String codArea) {
        this.codArea = codArea;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString(){
        return null;
    }

  
}
