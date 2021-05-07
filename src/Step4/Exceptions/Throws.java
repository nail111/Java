package Step4.Exceptions;

public class Throws {
    public static void main(String[] args) {
    try {
        foo();
    }catch (ArithmeticException e) {
        System.out.println("Деление на 0");
    }
    catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Выход за пределы массива");
    }finally {
        System.out.println("Result");
    }
    }
    private static void foo() throws ArrayIndexOutOfBoundsException,ArithmeticException{
        int[] arr = {1};
        arr[2] = 1;
        System.out.println(5/0); // Эта часть когда пропускается, т.к была уже найдена ошибка выше
    }
}