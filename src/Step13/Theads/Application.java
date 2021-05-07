package Step13.Theads;

public class Application {
    public static void main(String[] args) {
    Thread t = new Thread();
     t.setName("MyThread");
        System.out.println(t.getName());
        System.out.println("Приоритет потока: " +t.getPriority());
     try {
         for(int i=10;i>=0;i--) {
             System.out.println(i);
             Thread.sleep(1000);
         }
             }catch (Exception e) { e.printStackTrace(); }
    }
}