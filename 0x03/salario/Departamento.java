

public class Departamento {
    public double valorMeta;
    public double valorAtingidoMeta;

    public Departamento(double valorMeta, double valorAtingidoMeta) {
        setValorMeta(valorMeta);
        setvalorAtingidoMeta(valorAtingidoMeta);
    }

    public double getValorMeta() {
        return this.valorMeta;
    }

    public void setValorMeta(double valorMeta) {
        this.valorMeta = valorMeta;
    }

    public double getvalorAtingidoMeta() {
        return this.valorAtingidoMeta;
    }

    public void setvalorAtingidoMeta(double valorAtingidoMeta) {
        this.valorAtingidoMeta = valorAtingidoMeta;
    }

    public boolean alcancouMeta(){
        return true;
    }
}
