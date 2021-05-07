package Step5.Lambda.Second;

public class Demo {
    public static void main(String[] args) {
      AA a = (x,y) -> {
          if(x>y) return 0;
          else return 1;
        };
        System.out.println(a.result(10,20));
    }
}