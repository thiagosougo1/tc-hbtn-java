package quadrado;

public class Quadrado {

    public static double area(double lado) throws IllegalAccessException {
        try{
            if(lado > 0){
                return lado * lado;
            } else {
                throw new IllegalAccessException("Lado deve possuir valor positivo");
            }
        } catch (IllegalArgumentException e){
            System.out.println("L");
        }
        return lado;
    }
    
}
