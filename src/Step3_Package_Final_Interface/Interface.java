package Step3_Package_Final_Interface;
interface ABC {
    default void show() {
        System.out.println("Default");
    }
}
interface CBA {
    void show2(int a);
}
class Test implements ABC,CBA {
    public void show2(int a) {
        System.out.println(this.getClass());
    }
}
public class Interface {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.show();
        obj.show2(10);
    }
}