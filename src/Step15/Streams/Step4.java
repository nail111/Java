package Step15.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Step4 {
    public static void main(String[] args) {
        List<Integer> list4 = Arrays.asList(4,3,1,9,13);
        // reduce
        Optional<Integer> ooo = list4.stream().reduce((x,y) -> x+y);
        System.out.println(ooo.get());
        // collect
        List<Integer> list5 = list4.stream().filter(p-> p>3).collect(Collectors.toList());
        System.out.println(list5);
        // distinct
        List<Integer> list6 = Arrays.asList(1, 3, 3, 3, 3, 4, 1, 2, 5, 6);
        List<Integer> list7 = list6.stream().distinct().collect(Collectors.toList()); // Deletion repeat elements
        System.out.println(list7);
    }
}