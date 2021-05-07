package Step9_Generics_Overrading.Generics;

class Gen<T> {
    T obj;
    Gen(T obj) {
        this.obj = obj;
    }
    T show() {
       return obj;
    }
}

class Gen2<T,P> {
    T a;
    P b;
    Gen2(T a, P b) {
        this.a = a;
        this.b = b;
    }
    void show() {
        System.out.println(a + " " + b);
    }
}

public class Demo {
    public static void main(String[] args) {
     Gen<Integer> obj1 = new Gen<>(5);
     Gen<Double> obj2 = new Gen<>(2.2);
     Gen<String> obj3 = new Gen<>("Hello");
     Gen<Character> obj4 = new Gen<>('a');
     Gen<Boolean> obj5 = new Gen<>(true);
        System.out.println(obj1.show());
        Gen2<Integer,Boolean> obj6 = new Gen2<>(2,true);
        obj6.show();
    }
}