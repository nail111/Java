package Step2.Classes.BasicConcepts;

class A {
   private int a;
public A(int a) {
    this.a = a;
}
public A() {
    a = 0;
}
void show() {
    System.out.println(a);
}
}
public class Demo {
    public static void main(String[] args) {
    A obj = new A(5);
    A obj2 = new A(10);
    obj2.show();
    obj = obj2;
    obj.show();
    }
}