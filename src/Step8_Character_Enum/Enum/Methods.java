package Step8_Character_Enum.Enum;
enum Things4 {
    pen,pencil,speaker,box;
}
enum AAA {
    pen {
       public int qq(int x,int y) {return x+y;}
    },
    pencil {
       public int qq(int x,int y) {return x*y;}
    };
    public abstract int qq(int x,int y);
}
public class Methods {
    public static void main(String[] args) {
        Things4 things4,things5;
        //
        for(Things4 i:Things4.values()) {
            System.out.println(i + " " + i.ordinal()); // возвращает порядковый номер
        }
        //
       things4 = Things4.pen;
        things5 = Things4.pencil;
       int a = things4.compareTo(things5);
        System.out.println(a);
        //
        AAA aaa = AAA.pen;
        System.out.println(aaa.qq(2,3));
    }
}