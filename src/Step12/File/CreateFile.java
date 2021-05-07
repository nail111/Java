package Step12.File;

import java.io.File;

public class CreateFile {
    public static void main(String[] args) {
        try {
            File f = new File("Test.txt");
            if(f.createNewFile()) {
                System.out.println("File has been created: " + f.getName());
            }
            else {
                System.out.println("File exists: " + f.getName());
                System.out.println("Source of file: " + f.getAbsolutePath());
                System.out.println("Size of file: " + f.length());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}