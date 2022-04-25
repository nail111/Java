package Step5.Lambda.Example2;

public class Demo {
    public static void main(String[] args) {
        AA aa = a -> a*Math.random();
        System.out.println(aa.showA(10));
        aa.show2();
        AA.show();
    }
}

interface AA {
    double showA(int a);

    static void show() {
        System.out.println("Hello there");
    }

    default void show2() {
        System.out.println("Hello here");
    }
}