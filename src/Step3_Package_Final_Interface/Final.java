package Step3_Package_Final_Interface;
class Demo {
    private final int a;
    Demo(int a) {
        this.a =a;
    }
}
public class Final {
    public static void main(String[] args) {
        Demo obj = new Demo(5);
        final int a =5; // Константа
        final Demo obj2 = new Demo(1); // obj2 = new Demo(число) - ошибка т.к нельзя поменять адрес объекта
    }
}