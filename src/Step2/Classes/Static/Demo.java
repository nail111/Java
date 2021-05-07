package Step2.Classes.Static;

class A {
    A() {
        System.out.println("Default Constructor");
    }
    A(int a) {
        System.out.println("Constructor with " + a);
    }
    static {
        System.out.println("Static block");
    }
}

public class Demo {
    public static void main(String[] args) {
        A obj = new A(5);
    }
}