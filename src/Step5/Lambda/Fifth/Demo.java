package Step5.Lambda.Fifth;

interface Test {
    Welcome_to_the_club_buddy show(String str);
}

class Welcome_to_the_club_buddy {
String str;

    public Welcome_to_the_club_buddy(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    @Override
    public String toString() {
        return str;
    }
}
public class Demo {
    public static void main(String[] args) {
        Test test = Welcome_to_the_club_buddy::new;
        System.out.println(test.show("Есть пробитие"));
    }
}
