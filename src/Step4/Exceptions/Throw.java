package Step4.Exceptions;

public class Throw {
    public static void main(String[] args) {
        try {
            throw new ArrayIndexOutOfBoundsException("Error"); // намеренный вызов ошибки
        }catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}