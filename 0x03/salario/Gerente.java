

public class Gerente extends Empregado{

    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    public double calcularBonus(){
        return 2;
    }
}
