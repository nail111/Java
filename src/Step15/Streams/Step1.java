package Step15.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Step1 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(3);
        // forEach
        System.out.print("1: ");
        list1.stream().forEach(p -> System.out.print(p + " "));
        // count
        System.out.println("\n2: "+list1.stream().count());
        // filter
        System.out.print("3: ");
        list1.stream().filter(p-> !p.equals(3)).forEach(p -> System.out.print(p + " "));
        // skip
        System.out.print("\n" + "4: ");
        list1.stream().filter(p-> !p.equals(4)).skip(1).forEach(p -> System.out.print(p + " "));
    }
}