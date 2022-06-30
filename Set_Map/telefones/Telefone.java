package telefones;

public class Telefone {

    String codigoArea;
    String numero;
    public Telefone(String codigoArea, String numero) {
        setCodigoArea(codigoArea);
        setNumero(numero);
        toString();
    }

    public String getCodigoArea() {
        return this.codigoArea;
    }

    public void setCodigoArea(String codigoArea) {
        this.codigoArea = codigoArea;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }


    @Override
    public String toString(){
        return "(" + getCodigoArea() + ") " + getNumero();
    }

  
}
