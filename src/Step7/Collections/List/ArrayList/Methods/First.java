package Step7.Collections.List.ArrayList.Methods;

import java.util.ArrayList;

public class First {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        // add - добавление элементов
        list.add('Q');
        list.add(0,"Hello"); // Поменстил в начало
        System.out.println("add: "+list);
        // get - получение по индексу
        System.out.println("get: "+list.get(0));
        // size == length
        System.out.println("size: "+list.size());
       // set - заменяет
        list.set(0,"Bye");
        System.out.println("set: "+list);
        // remove - удаление по индексу
        list.remove(0);
        System.out.println("remove: "+ list);
        // addAll - добавляет все элементы другого листа
        ArrayList list1 = new ArrayList();
        list1.add("Bye");
        list.addAll(0,list1);
        System.out.println("addAll: "+ list);

    }
}