package Step7.HashSet;

import java.util.HashSet;

public class Demo {
    public static void main(String[] args) {
        HashSet<String> obj = new HashSet<>();
        obj.add("Mazda");
        obj.add("Apple");
        obj.add("Android");
        obj.add("Ford");
        System.out.println("----------------");
        if(obj.contains("Mazda")) {
            System.out.println(true);
        }
        System.out.println("----------------");
        obj.stream().forEach(s -> System.out.println(s));
        System.out.println("----------------");
        System.out.println(obj.size());
        System.out.println("----------------");
        HashSet<String> obj2 = (HashSet<String>) obj.clone();
        System.out.println(obj2.size());
        System.out.println("----------------");
    }
}
