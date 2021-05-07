package Step13.Theads;

class Demo2 implements Runnable {
    public void run() {
        try {
            for(int i=0;i<10;i++) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
                Thread.sleep(1000);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
public class Join {
    public static void main(String[] args) {
   Thread t1 = new Thread(new Demo2());
   Thread t2 = new Thread(new Demo2());
   t1.start();
   try {
       t1.join();
   }catch (Exception e) {
       e.printStackTrace();
   }
   t2.start();
    }
}