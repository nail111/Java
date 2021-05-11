package Step7.LinkedList;
import java.util.LinkedList;
import java.util.List;

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
