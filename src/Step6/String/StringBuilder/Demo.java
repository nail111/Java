package Step6.String.StringBuilder;

import java.lang.StringBuilder;
public class Demo {
    public static void main(String[] args) {
        // 1
        StringBuilder obj = new StringBuilder("Hello ");
              // append - добавляет текст в конец строки
        obj.append("World");
        String obj2 = new String("!!!");
        obj.append(obj2);
        System.out.println("1) " +obj);
        // 2
              // reverse - Обратный порядок
        System.out.println("2) "+obj.reverse());
           // delete
        System.out.println("3) "+obj.reverse().delete(0,2)); // 0 вкл, 2 невкл
        // insert - Вставляет строку
        System.out.println("4) " + obj.insert(0,"He"));
       //replace - заменяет
        System.out.println("5) " + obj.replace(0,5,"Bye"));
    }
}