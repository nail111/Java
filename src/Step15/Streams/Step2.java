package Step15.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Step2 {
    public static void main(String[] args) {
        List<Integer> list2 = Arrays.asList(1, 9, 5, 3, 4, 7, 2, 6, 9, 8, 7, 4, 1, 2, 3, 6, 5, 4);
        // limit
        System.out.print("1: ");
        list2.stream().filter(p-> p%2==0).limit(3).forEach(p -> System.out.print(p + " "));
        // findFirst
        int a =  list2.stream().filter(p->p%2==0).findFirst().get();
        System.out.println("\n2: "+a);
        // max and min
        int b = list2.stream().max(Integer::compareTo).get();
        System.out.println("3.1: "+b);
        b = list2.stream().min(Integer::compareTo).get();
        System.out.println("3.2: "+b);
    }
}