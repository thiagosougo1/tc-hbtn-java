public class FolhaPagamento implements CalculadorDeSalario{
    public static double calcularLiquido(Funcionario funcionario, CalculadorDeSalario calculador){
        return calculador.calcular(funcionario.getSalario());
    }

    @Override
    public double calcular(double valor) {
        return 0;
    }
}
