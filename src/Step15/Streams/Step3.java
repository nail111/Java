package Step15.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Step3 {
    public static void main(String[] args) {
        List<Integer> list3 = Arrays.asList(4,3,1,6,2,8,12,623,2,3,8,9);
        // sorted
        list3.stream().sorted().forEach(p-> System.out.print(p + " "));
        // findAny
        System.out.println();
       int a = list3.stream().findAny().get();
        System.out.println(a);
        // anyMatch, allMatch, noneMatch
        boolean a1 = list3.stream().anyMatch(p-> p>10); // возвращает true, если хоть один элемент потока удовлетворяют условию в предикате
        System.out.println(a1);
        a1 = list3.stream().allMatch(p-> p>2); // возвращает true, если все элементы потока удовлетворяют условию в предикате
        System.out.println(a1);
        a1 = list3.stream().noneMatch(p-> p==10); // возвращает true, если ни один из элементов в потоке не удовлетворяет условию в предикате
        System.out.println(a1);
    }
}