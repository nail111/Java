package Step15.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Step5 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Mike","Michael","Paul","Second");
        // map
        list1.stream().map(p -> p.length()).forEach(p -> System.out.print(p + " "));
        System.out.println();
        list1.stream().map(p -> p.toUpperCase()).forEach(p -> System.out.print(p + " "));
        System.out.println();
        list1.stream().filter(p-> p.length()>4).map(User::new).forEach(p -> System.out.print(p + " "));

    }
}
class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}