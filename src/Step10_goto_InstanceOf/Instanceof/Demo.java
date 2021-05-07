package Step10_goto_InstanceOf.Instanceof;

public class Demo {

    public static void main(String[] args) {
        Jumpable j = new Man();
        Man m = new Man();
        Student s = new Student();
        if(j instanceof Jumpable) { System.out.println("j instance of Jumpable"); }
        if(m instanceof Human) { System.out.println("m instance of Human"); }
        if(s instanceof Jumpable) {} else {System.out.println("s doesn't instance of Jumpable");}
        if(j instanceof Object) {System.out.println("j instance of Object");}
        Object o = new Object();
        if(o instanceof Human) {} else {System.out.println("o doesn't instance of Human");}
    }
}
interface Jumpable {}
class Human implements Jumpable{}
class Man extends Human{}
class Student{}
