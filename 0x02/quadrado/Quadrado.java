

public class Quadrado {

    public static double area(double lado) throws IllegalArgumentException {
        try{
            if(lado > 0){
                return lado * lado;
            } else {
                throw new IllegalArgumentException("Lado deve possuir valor positivo");
            }
        } catch (IllegalArgumentException e){
            throw new IllegalArgumentException("Lado deve possuir valor positivo");
        }
    }
    
}
