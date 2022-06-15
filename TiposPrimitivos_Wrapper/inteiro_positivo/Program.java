package TiposPrimitivos_Wrapper.inteiro_positivo;
public class Program {
    public static void main(String[] args) {
        try {
            InteiroPositivo inteiroPositivo = new InteiroPositivo("1");
            System.out.println(inteiroPositivo.getValor() + " - " + inteiroPositivo.ehPrimo());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        InteiroPositivo inteiroPositivo1 = null;

        try {
            inteiroPositivo1 = new InteiroPositivo("43");
            System.out.println(inteiroPositivo1.getValor() + " - " + inteiroPositivo1.ehPrimo());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            inteiroPositivo1.setValor(-1);
            if(inteiroPositivo1.getValor() < 0){
                throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            inteiroPositivo1.setValor(44);
            System.out.println(inteiroPositivo1.getValor() + " - " + inteiroPositivo1.ehPrimo());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            InteiroPositivo inteiroPositivo = new InteiroPositivo("-3");
            if(inteiroPositivo.getValor() < 0){
                throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
            }        
        } catch (Exception ex) {
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