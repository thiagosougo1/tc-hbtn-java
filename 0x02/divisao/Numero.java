public class Numero {

    static int resultado = 1;

    public static void dividir(int a, int b) {
        try{
            resultado = a / b;
        } catch (Exception e){
            System.out.println("Nao eh possivel dividir por zero");
        } finally{
            if(b == 0)
            System.out.println(a + " / " + b + " = 0");
            else
            System.out.println(a + " / " + b + " = " + resultado);

        }
    }
    
}
