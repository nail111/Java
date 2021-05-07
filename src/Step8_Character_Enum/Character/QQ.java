package Step8_Character_Enum.Character;

public class QQ {
    public static void main(String[] args) {
        char[] c = {' ','a','B','2'};
         for(int i=0;i<c.length;i++) {
             if(Character.isLowerCase(c[i])) {
                 System.out.print(c[i] + "= Low");
                 System.out.println();
             }
             if(Character.isUpperCase(c[i])) {
                 System.out.print(c[i] + "= Up");
                 System.out.println();
             }
           if(Character.isWhitespace(c[i])) {
               System.out.print("White space in: " + i + " element");
               System.out.println();
           }
           if(Character.isLetter(c[i])) {
               System.out.print(c[i] + " = буква");
               System.out.println();
           }
           if(Character.isDigit(c[i])) {
               System.out.print(c[i] + " = цифра");
               System.out.println();
           }
         }
    }
}