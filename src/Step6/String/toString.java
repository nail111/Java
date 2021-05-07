package Step6.String;
class NewClass {
    public NewClass(int a, int b) {
        this.a = a;
        this.b = b;
    }
    private int a,b;
    @Override
    public String toString() {
    return a+ " " + b;
    }
}
public class toString {
    public static void main(String[] args) {
 NewClass obj = new NewClass(1,2);
        System.out.println(obj);
    }
}