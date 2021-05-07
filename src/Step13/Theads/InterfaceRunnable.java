package Step13.Theads;

class Demo implements Runnable {
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

public class InterfaceRunnable {
    public static void main(String[] args) {
     Thread t1 = new Thread(new Demo());
     Thread t2 = new Thread(new Demo());
     t1.start();
        System.out.println("Hey");
     t2.start();
    }
}