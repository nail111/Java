package Step7.Collections.List.ArrayList.Methods;
import java.util.ArrayList;

public class Second {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        // Пример с использованием StringBuilder
        list1.add(new StringBuilder("Hello"));
        System.out.println("StringBuilder: " + list1);
        //indexOf
        list1.add("Q");
        int i = list1.indexOf("Q");
        System.out.println("indexOf: " + i + " " + list1);
        // isEmpty
        System.out.println("isEmpty: " + list1.isEmpty());
        // contains - содержать
        System.out.println("contains: " + list1.contains("Q"));
        //toArray
        Object[] obj = list1.toArray();
        System.out.print("toArray: ");
        for(Object j:obj) {
            System.out.print(j + " ");
        }
        System.out.println();
        // clear - удаляет все элементы
        list1.clear();
        System.out.println("clear: " + list1);
    }
}