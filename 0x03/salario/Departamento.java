
public class Departamento {
    double valorMeta;
    double valorAntingidoMeta;


    public Departamento(double valorMeta, double valorAntingidoMeta) {
        setValorMeta(valorMeta);
        setValorAntingidoMeta(valorAntingidoMeta);
    }

    public double getValorMeta() {
        return this.valorMeta;
    }

    public void setValorMeta(double valorMeta) {
        this.valorMeta = valorMeta;
    }

    public double getValorAntingidoMeta() {
        return this.valorAntingidoMeta;
    }

    public void setValorAntingidoMeta(double valorAntingidoMeta) {
        this.valorAntingidoMeta = valorAntingidoMeta;
    }

    public boolean alcancouMeta(){
        return true;
    }
}
