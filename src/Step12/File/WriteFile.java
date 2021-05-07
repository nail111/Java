package Step12.File;

import java.io.File;
import java.io.FileWriter;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter f = new FileWriter("test2.txt");
            f.write("qwerty");
            f.write("\nqwerty ");
            f.close();
        }catch (Throwable e) {
            e.printStackTrace();
        }
    }
}