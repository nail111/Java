package Step7.Collections.List.Vector;

import java.util.List;
import java.util.Vector;

// Устаревший класс
// Synchronized
// Медленный

public class Demo {
    public static void main(String[] args) {
        List<String> list = new Vector<>();
        list.add("First");
        list.add("Second");
        System.out.println(list);
    }
}
