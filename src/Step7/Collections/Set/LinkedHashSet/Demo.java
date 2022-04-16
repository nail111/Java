package Step7.Collections.Set.LinkedHashSet;

// Использует HashTable и double linked list для хранения элементов
// Элементы упорядочены
// Требует больше памяти, чем HashSet
// Показывает низкую производительность, чем HashSet

import java.util.LinkedHashSet;

public class Demo {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("First");
        linkedHashSet.add("Second");
        linkedHashSet.add("Third");
        System.out.println(linkedHashSet);
    }
}
