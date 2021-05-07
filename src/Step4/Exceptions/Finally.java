package Step4.Exceptions;

public class Finally {
    public static void main(String[] args) {
        try {
            System.out.println(5/0);
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("Finally"); // выполняется после блока кода catch
        }
    }
}