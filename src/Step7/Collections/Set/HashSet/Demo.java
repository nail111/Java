package Step7.Collections.Set.HashSet;

import java.util.*;

// Хранит только уникальные элементы
// Может хранить null
// Элементы не упорядочены
// Non synchronized
// Лучший для поиска информации

public class Demo {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("First");
        set1.add("Second");
        set1.add("Third");
        System.out.println(set1);
        Set<Person> set2 = new HashSet<>();
        set2.add(new Person(3,"Anna"));
        set2.add(new Person(1,"Messi"));
        List<Person> list = new LinkedList<>(set2);
        Collections.sort(list);
        System.out.println("sort by id \n"+list);
        Collections.sort(list,new PersonNameCompare());
        System.out.println("sort by name \n" + list);
    }
}

class Person implements Comparable<Person> {
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        return this.id - o.id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class PersonNameCompare implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.name.compareTo(o2.name);
    }
}