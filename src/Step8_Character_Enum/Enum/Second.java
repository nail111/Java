package Step8_Character_Enum.Enum;
enum Things2 {
    pen,pencil,mobile,key,speaker
}
public class Second {
    public static void main(String[] args) {
        Things2[] things2 = Things2.values(); // Метод values() возвращает массив, содержащий список констант перечислимого типа
        for(Things2 i: things2) System.out.println(i);
    }
}