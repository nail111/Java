package Step8_Character_Enum.Enum;
enum Things3 {
pen(2),pencil(1),speaker(10);
private int price;
          Things3(int i) {
               price = i;
          }
          int getPrice() {return price;}
}
public class EnumAsAclass {
    public static void main(String[] args) {
Things3[] things3 = Things3.values();
for(Things3 i:things3) {
    System.out.println(i + " стоит: " + i.getPrice());
}
    }
}