package Step16.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        // put
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(1,"First");
        map1.put(null,"Second");
        map1.put(3,null);
        System.out.println("put: \n" + map1);
        // Same key
        map1.put(1,"This is the first");
        System.out.println("Same key: \n" + map1);
        // putIfAbsent
        map1.putIfAbsent(1,"But this is the first");
        map1.putIfAbsent(4,"New element");
        System.out.println("putIfAbsent: \n" + map1);
        // get
        System.out.println("get: \n" + map1.get(null));
        // remove
        map1.remove(4);
        System.out.println("remove: \n" + map1);
        // containsValue and containsKey
        System.out.println("containsValue and containsKey: \n" + map1.containsValue("New element") + " " + map1.containsKey(1));
        // keySet
        System.out.println("keySet: \n" + map1.keySet());
        // values
        System.out.println("values: \n" + map1.values());

    }
}
