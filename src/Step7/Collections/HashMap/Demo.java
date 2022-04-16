package Step7.Collections.HashMap;

import java.util.HashMap;

public class Demo {
    public static void main(String[] args) {
        System.out.println("----------------");
        HashMap<String,String> obj = new HashMap<>();
        obj.put("England", "London");
        obj.put("Germany", "Berlin");
        obj.put("Norway", "Oslo");
        obj.put("USA", "Washington DC");
        System.out.println(obj);
        System.out.println("----------------");
    }
}
