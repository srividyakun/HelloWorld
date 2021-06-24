package DateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeDemo {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalTime localTime1 = LocalTime.parse("20:30");
        System.out.println(localTime1);

        LocalTime localTime2 = LocalTime.of(9,30,25);
        System.out.println(localTime2);

        LocalTime localTime3 = localTime2.plus(1, ChronoUnit.HOURS);
        System.out.println(localTime3);

        boolean isBefore = LocalTime.parse("09:30").isBefore(LocalTime.parse("09:35"));
        System.out.println(isBefore);

        LocalTime localTime4 = LocalTime.MAX;
        System.out.println(localTime4);
        System.out.println(LocalTime.MIDNIGHT);
    }
}
