package salario;

public class Gerente extends Empregado{

    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    public double calcularBonus(Departamento departamento){
        if(departamento.getValorMeta() <= departamento.getvalorAtingidoMeta()){
            double soma = (departamento.getvalorAtingidoMeta() - departamento.getValorMeta()) * 0.01;
            return salarioFixo * 0.2 + soma;
        } else return 0.00;    
    }
}
