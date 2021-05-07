package Step2.Classes.Extends.Basic;
class A {
    int a;
}
class B extends A {
    B(int a) {
        this.a = a;
        System.out.println(this.a);
    }
}
public class Demo {
    public static void main(String[] args) {
        // 1
        B obj = new B(5);
    }
}