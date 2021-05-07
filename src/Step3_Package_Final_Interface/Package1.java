package Step3_Package_Final_Interface;
import Step3_Package_Final_Interface.Package2.Demo;
import static Step3_Package_Final_Interface.Package2.Demo2.a;
import static Step3_Package_Final_Interface.Package2.Demo2.show2;


public class Package1 {
    public static void main(String[] args) {
       Demo obj = new Demo();
       obj.show();
        System.out.println(a);
        show2();
    }
}