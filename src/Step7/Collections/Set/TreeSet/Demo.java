package Step7.Collections.Set.TreeSet;

import java.util.*;

// TreeSet хранит только уникальные элементы
// Время доступа и поиска очень быстрое
// Не может хранить null
// Non synchronized
// Автоматически сортирует по возрастанию (TreeSet implements NavigableSet -> NavigableSet extends SortedSet)

public class Demo {
    public static void main(String[] args) {
        Set<Integer> set1 = new TreeSet<>();
        set1.add(2);
        set1.add(1);
        System.out.println(set1);
        System.out.println("===================");
        Set<Person> set2 = new TreeSet<>();
        set2.add(new Person(2,"Anna",100));
        set2.add(new Person(1,"Boba",200));
        List<Person> list = new LinkedList<>(set2);
        // sort by id
        Collections.sort(list);
        System.out.println("sort by id \n" + list);

        //sort by name
        Collections.sort(list,new PersonNameCompare());
        System.out.println("sort by name \n"+list);

        //sort by salary
        Collections.sort(list,new PersonSalaryCompare());
        System.out.println("sort by salary \n"+list);
    }
}

class Person implements Comparable<Person>{
    int id;
    String name;
    int salary;

    public Person(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
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
                ", salary=" + salary +
                '}';
    }
}

class PersonNameCompare implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.name.compareTo(o2.name);
    }
}

class PersonSalaryCompare implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.salary - o2.salary;
    }
}