package Step16.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Demo2 {
    public static void main(String[] args) {
        // Override equals and hashCode
        Student st1 = new Student("Anna",20);
        Student st2 = new Student("Boba", 30);
        Student st3 = new Student("Kenny",15);
        // Без override equals and hashCode, st4 тоже добавится, т.к разные хэш коды
        Student st4 = new Student("Kenny",15);
        Map<Student,Boolean> map = new HashMap<>();
        map.put(st1, true);
        map.put(st2,true);
        map.put(st3,false);
        map.put(st4,true);
        for(Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + ": " + m.getValue());
        }
    }
}

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
