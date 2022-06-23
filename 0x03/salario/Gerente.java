

public class Gerente extends Empregado{

    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    public double calcularBonus(Departamento departamento){
        if(departamento.getValorMeta() <= departamento.getvalorAtingidoMeta()){
            return Math.ceil(salarioFixo * 0.20);
        } else return 0.00;    }
}
