package Step10_goto_InstanceOf.Break;

public class Demo {
    public static void main(String[] args) {
     boolean b = true;
     First: {
         Second: {
                    Third: {
                      if(b) break Second;
                        System.out.println("Third"); // Не видно
                    }
             System.out.println("Second"); // не видно
         }
         System.out.println("First"); //видно
     }


     First: {
         Second: {
         Third:{
             System.out.println("Third"); // видно
            if(b) break First;
              }
             System.out.println("Second"); // не видно
         }
         System.out.println("First"); // не видно
     }
}}