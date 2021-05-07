package Step5.Lambda.Third;

public class Demo {
    public static void main(String[] args) {
        AA<Integer> a = (x) -> {
          int q = x + 10;
            return q;
        };
        System.out.println(a.result(10));
    }
}