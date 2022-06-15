package TiposPrimitivos_Wrapper.inteiro_positivo;
public class Program {
    public static void main(String[] args) {
        try {
            InteiroPositivo inteiroPositivo = new InteiroPositivo(1);
            System.out.println(inteiroPositivo.getValor() + " - false" );
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        InteiroPositivo inteiroPositivo1 = null;

        try {
            inteiroPositivo1 = new InteiroPositivo(43);
            System.out.println(inteiroPositivo1.getValor() + " - " + inteiroPositivo1.ehPrimo());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            inteiroPositivo1.setValor(-1);
            inteiroPositivo1.ehInteiro();
            if(inteiroPositivo1.ehInteiro()){
                System.out.println("ok");
        } else{
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            inteiroPositivo1.setValor(44);
            System.out.println(inteiroPositivo1.getValor() + " - " + inteiroPositivo1.ehPrimo());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            InteiroPositivo inteiroPositivo = new InteiroPositivo(-3);
            if(inteiroPositivo.ehInteiro()){
                System.out.println("ok");
        } else{
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            InteiroPositivo inteiroPositivo = new InteiroPositivo(379);
            System.out.println(inteiroPositivo.getValor() + " - " + inteiroPositivo.ehPrimo());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            InteiroPositivo inteiroPositivo = new InteiroPositivo(378);
            System.out.println(inteiroPositivo.getValor() + " - " + inteiroPositivo.ehPrimo());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}