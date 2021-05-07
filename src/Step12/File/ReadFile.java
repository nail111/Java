package Step12.File;

import java.io.FileReader;
import java.io.FileWriter;

public class ReadFile {
    public static void main(String[] args) {
        try {
            FileWriter f1 = new FileWriter("test.txt");
            f1.write("Some text");
            FileReader f2 = new FileReader("test.txt");
            String str = f2.toString();
            System.out.println(str);
            f1.close();
            f2.close();

        }catch (Throwable e) {
            e.printStackTrace();
        }
    }
}