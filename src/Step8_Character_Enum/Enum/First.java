package Step8_Character_Enum.Enum;

enum Things {
 pen,pencil,mobile,key,speaker
}
public class First {
    public static void main(String[] args) {
      Things things;
      things = Things.pen;
      System.out.println(things);
      Things things1 = Things.mobile;
      if(things==things1) {System.out.println("Yes"); } else {
          System.out.println("No");
      }
    }
}