package Step7.Collections.List.LinkedList;
import java.util.LinkedList;
import java.util.List;

// Использует двусвязный список для хранения элементов
// Манипуляции выполняются быстрее, чем ArrayList, поскольку он использует двусвязный список
// поэтому в памяти не требуется смещения битов
// Может действовать как list и queue, поскольку он реализует интерфейсы list и Deque
// Этот класс подходит лучше для управления данными

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> str = new LinkedList<>();
        str.add("Hello");
        str.addFirst("Bye");
        str.clear();
        System.out.println(str.getClass());
        List<String> obj = new LinkedList<>();
        obj.add("Hello");
        obj.remove(0);
        obj.clear();
        System.out.println(obj.getClass());
    }
}
