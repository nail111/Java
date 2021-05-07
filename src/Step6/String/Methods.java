package Step6.String;

public class Methods {
    public static void main(String[] args) {
        // 1
        String obj = new String("Hello");
        System.out.println(obj.length());
        System.out.println(obj.charAt(4)); // - поиск по индексу
        System.out.println(obj.equals("Hello"));
        System.out.println(obj.startsWith("Hel"));
        System.out.println(obj.endsWith("o"));
        // 2
        String obj2 = new String("400");
        System.out.println(obj2.valueOf(5.5)); // - преобразует
       // 3
        String obj3 = "      Hello";
        String obj4 = "World          ";
        String obj5 = obj3+obj4;
        System.out.println(obj5.trim().replace('H','h').toLowerCase());
        // trim - удаляет пробелы
    }
}