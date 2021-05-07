package Step11_Casting_Polymorphism.Casting;

public class Demo2 {
    public static void main(String[] args) {
     Human obj1 = new Man();
     Human obj2 = new Woman();
        System.out.println(((Man)obj1).man);
        System.out.println(((Woman)obj2).woman);
        // System.out.println(obj1.man); - error
    }
}
class Human {}
class Man extends Human {
String man = "Man";
}
class Woman extends Human {
    String woman = "Woman";
}