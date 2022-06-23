
public class Quadrado {

    public static double area(double lado) throws IllegalAccessException {
        try{
            if(lado > 0){
                return lado * lado;
            } else {
                throw new IllegalAccessException("Lado deve possuir valor positivo");
            }
        } catch (IllegalArgumentException e){
            throw new IllegalAccessException("Lado deve possuir valor positivo");
        }
        return lado;
    }
    
}
