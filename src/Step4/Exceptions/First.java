package Step4.Exceptions;

public class First {
    public static void main(String[] args) {
      try {
          System.out.println(5/0);
          System.out.println("Эта часть кода не рассматривается");
      }catch (ArithmeticException e) {
          System.out.println("Error: " + e);
          e.printStackTrace(); // printStackTrace() помогает программисту понять, где возникла настоящая проблема.
          System.err.println("RED text");
      }
    }
}