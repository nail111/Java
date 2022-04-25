package Step5.Lambda.Example;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Anna",20, 'f'));
        students.add(new Student("Bonn",30,'m'));
        students.add(new Student("Conny",15,'m'));

        CheckStudent checkStudent = new CheckStudent();
        checkStudent.checkStudent(students, s -> s.age<20);
    }
}

class CheckStudent {
    void checkStudent(ArrayList<Student> students, TestStudent testStudent) {
        for(Student s: students) {
            if(testStudent.check(s)) {
                System.out.println(s);
            }
        }
    }
}

interface TestStudent {
    boolean check(Student student);
}

class Student {
    String name;
    int age;
    char gender;

    public Student(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
