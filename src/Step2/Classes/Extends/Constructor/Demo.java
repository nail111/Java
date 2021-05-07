package Step2.Classes.Extends.Constructor;

class A{
    A() {
        System.out.println("A");
    }
    A(int a) {
        System.out.println("A with par");
    }
}
class B extends A {
    B(){
        System.out.println("B");
    }
    B(int i) {
        System.out.println("B with par");
    }
}
public class Demo {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println();
        B obj2 = new B(5);
    }

}