package divisao;

public class Numero {
    static int resultado = 1;
    public static void dividir(int a, int b) {
        try{
            resultado = a / b;
        } catch (Exception e){
            System.out.println("Não eh possivel dividir por zero");
        } finally{
            if(b == 0){
                System.out.println("9 / 0 = 0");
            } else
            System.out.println(a + " / " + b + " = " + resultado);

        }
    }
    
}
