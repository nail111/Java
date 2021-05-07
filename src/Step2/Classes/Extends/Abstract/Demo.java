package Step2.Classes.Extends.Abstract;

abstract class C {
       abstract void show();
       void show2(){
           System.out.println("Можно создать неабс метод тоже в абс классе");
       }
}
class A extends C{
     void show() {
         System.out.println(this.getClass());
     }
}
public class Demo {
    public static void main(String[] args) {
   A obj = new A();
   obj.show();
   obj.show2();
    }
}