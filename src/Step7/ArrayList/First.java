package Step7.ArrayList;

import java.util.ArrayList;

public class First {
    public static void main(String[] args) {
        // Без определенного типа
        ArrayList list = new ArrayList();
        list.add(5);
        list.add("QQ");
        list.add(new StringBuilder("WW"));
        list.add(true);
        System.out.println(list);
        // С определенным типом
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
        //
       ArrayList list3 = new ArrayList(list);
        System.out.println(list3==list);
        // Они не ссылаются на один и тот же объект. Просто создаётся такой же объект
    }
}