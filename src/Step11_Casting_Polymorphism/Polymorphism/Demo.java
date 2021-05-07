package Step11_Casting_Polymorphism.Polymorphism;

abstract class C1 {
abstract void work();
}
class C2 extends C1 {
    void work() {
        System.out.println("C2 works");
    }
}
class C3 extends C1 {
    void work() {
        System.out.println("C3 works");
    }
}
public class Demo {
    public static void main(String[] args) {
        C1 obj1 = new C2();
        C1 obj2 = new C3();
        C1[] obj3 = {obj1,obj2};
        for(C1 i: obj3) {
            i.work();
        }
    }
}