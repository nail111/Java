package Step5.Lambda.Fourth;


interface Test {
    void Hey(int a);
}
public class Demo {
    static void show1(int a) {
        System.out.println(a);
    }
    static void show2(int a) {
        System.out.println(++a);
    }
    public static void main(String[] args) {
        Test test = Demo::show1;
        test.Hey(10);
        test = Demo::show2;
        test.Hey(20);
    }
}
