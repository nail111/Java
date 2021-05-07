package Step5.Lambda.First;

public class Demo {
    public static void main(String[] args) {
        AA a = () -> System.out.println("Hello");
        a.foo1();
        BB b = (q,w) -> Math.random() * q*w;
        System.out.println(b.foo2(2.0,3.0));
        CC c = (t) -> (t>5);
        System.out.println(c.foo3(5));
    }
}