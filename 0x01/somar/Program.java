package somar;

public class Program {
    public static void main(String[] args) {
        try {
          int[] myNumbers = {1, 2, 3};
          System.out.println(myNumbers[10]);
                System.out.println(myNumbers[0]);
        } catch (Exception e) {
          System.out.println("Something went wrong.");
        } finally {
          System.out.println("The 'try catch' is finished.");
        }
      }
}
