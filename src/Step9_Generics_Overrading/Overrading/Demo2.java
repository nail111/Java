package Step9_Generics_Overrading.Overrading;
interface AA {
   public abstract int show(int a);
}
class BB implements AA {
    @Override
   public int show(int a) {
       return a;
   }
}
public class Demo2 {
    public static void main(String[] args) {
      BB obj = new BB();
        System.out.println("obj = " + obj.show(2));
    }
}