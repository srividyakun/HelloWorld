package DateTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodAndDurationDemo {
    public static void main(String[] args) {
        LocalDate initialDate = LocalDate.parse("2021-06-23");
        System.out.println(initialDate);

        LocalDate finalDate = initialDate.plus(Period.ofDays(3));
        System.out.println(finalDate);

        Period period = Period.between(initialDate,finalDate);
        System.out.println(period.getDays());

        int days = Period.between(initialDate,finalDate).getDays();
        System.out.println(days);

        long between = ChronoUnit.DAYS.between(initialDate,finalDate);
        System.out.println(between);

        //-----------------DURATION----------------------------------

        LocalTime initialTime = LocalTime.of(6,30,0);
        LocalTime finalTime = initialTime.plus(Duration.ofSeconds(30));

       long seconds =  Duration.between(initialTime,finalTime).getSeconds();
        System.out.println(seconds);

        long seconds1 = ChronoUnit.SECONDS.between(initialTime,finalTime);
        System.out.println(seconds1);
    }
}
