package Step2.Classes.Extends.Super;

class A{
    A() {}
    A(int b) {
        System.out.println(b);
    }
 int a;
 void show() {
     System.out.println(a);
 }
}
class B extends A {
    B() {
        super(6);
        super.a = 5;
        super.show();
    }
}
public class Demo {
    public static void main(String[] args) {
     B obj =new B();
    }
}