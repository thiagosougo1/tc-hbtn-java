package pares;

public class NumerosPares {
    public static void main(String[] args) {
        int i = 0;
        while(i < 97){
            if(i % 2 ==0 ){
                System.out.print(i + ", ");
            }
            i++;
        }
        System.out.println("98");
    }
}
