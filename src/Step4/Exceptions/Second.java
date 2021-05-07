package Step4.Exceptions;


import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            if (a == 1) {
                System.out.println(5 / 0);
            } else {
                int[] arr = {1};
                arr[3] = 54;
            }
        }catch(ArithmeticException e){
                System.out.println("Деление на 0");
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Выход за пределы массива");
            }
        }
    }
