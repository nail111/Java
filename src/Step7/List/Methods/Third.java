package Step7.List.Methods;

import java.util.*;

public class Third {
    public static void main(String[] args) {
           // asList
        Object[] obj = {1,2,"W"};
        List list1 = Arrays.asList(obj);
        System.out.println("asList: "+list1);
        // Collection.sort
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("F");
        list2.add("B");
        Collections.sort(list2);
        System.out.println("Collection.sort: "+list2);
        // removeAll - удаляет элементы 2-го листа из 1-го
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("F");
        list2.removeAll(list3);
        System.out.println("removeAll: "+list2);
        //retainAll - сохраняет только одинаковые элементы
        list2.add("F");
        list2.retainAll(list3);
        System.out.println("retainAll: "+list2);
        // subList - Возвращает отрывок листа
        List list4 = list1.subList(0,list1.size());
        System.out.println("subList: "+list4);
        //List.of - быстрое создание элементов
        List list5 = List.of(1,2,"W","Q");
        System.out.println("List.of: "+list5);
        //List.copyOf - копирует коллекцию в лист
        List list6 = List.copyOf(list2);
        System.out.println("List.copyOf: "+list6);
    }
}