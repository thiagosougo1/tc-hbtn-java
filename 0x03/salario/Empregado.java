
public class Empregado {
    double salarioFixo;

    public Empregado(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double getSalarioFixo() {
        return this.salarioFixo;
    }
    
    public double calcularBonus(Departamento departamento) {
        if(departamento.getValorMeta() <= departamento.getvalorAtingidoMeta()){
            return salarioFixo * 0.1;
        } else return 0.00;
    }
    
    public  double calcularSalarioTotal(Departamento departamento){
        return salarioFixo + calcularBonus(departamento);
    }
}

