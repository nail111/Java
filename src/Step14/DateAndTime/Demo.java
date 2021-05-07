package Step14.DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Demo {

    public static void main(String[] args) {
        // 1
        System.out.println("1: \n"+LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        // 2
        LocalDate ld1 = LocalDate.of(2017,11, 23);
        System.out.println("2: \n"+ld1);
        System.out.println(LocalDateTime.of(LocalDate.of(2015,2,11),LocalTime.of(11,37)));
        // 3
        System.out.println("3: \n"+LocalDate.of(2010,1,2).plusDays(5));
        System.out.println(LocalDate.of(2010,1,2).getDayOfWeek());
        // 4
        System.out.println("4: \n" + LocalDate.of(2010,1,2).isAfter(LocalDate.of(2009,1,2)));
        // 5
        System.out.println("5: \n" + Period.ofMonths(2)); // Каждые 2 месяца

    }
}
