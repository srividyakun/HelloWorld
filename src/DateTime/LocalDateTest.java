package DateTime;

import java.time.*;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDateTest {
    public static void main(String[] args) {
       //getLocalDateDemo1();
        DayOfWeek dayOfWeek = LocalDate.parse("2021-06-21").getDayOfWeek();
        System.out.println(dayOfWeek);
        int dayOfMonth = LocalDate.parse("2021-06-21").getDayOfMonth();
        System.out.println(dayOfMonth);


        LocalDate thisYear = LocalDate.now();
        System.out.println(thisYear.isLeapYear());

        LocalDate previousYear = LocalDate.now().minusYears(1);
        System.out.println(previousYear.isLeapYear());

        boolean isBefore = LocalDate.parse("2017-03-01").isBefore(LocalDate.parse("2017-02-28"));
        System.out.println("Is before :" +isBefore);

        boolean isAfter = LocalDate.parse("2021-03-01").isAfter(LocalDate.parse("2021-02-01"));
        System.out.println("Is After :" +isAfter);

       LocalDateTime atStartOfDay =  LocalDate.parse("2021-03-01").atStartOfDay();
        System.out.println(atStartOfDay);

        LocalDate with = LocalDate.parse("2021-03-08").with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(with);
    }

    public static void getLocalDateDemo1(){
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate localDate1 = LocalDate.now(Clock.systemDefaultZone());
        System.out.println(localDate1);

        Clock clock = Clock.systemDefaultZone();
        LocalDate localDate2 = LocalDate.now(clock);
        System.out.println(localDate2);

        ZoneId zoneId = ZoneId.of("Europe/Paris");
        LocalDate localDate3 = LocalDate.now(zoneId);
        System.out.println(localDate3);

        LocalDate localDate4 = LocalDate.of(2021,06,21);
        System.out.println(localDate4);

        LocalDate localDate5 = LocalDate.parse("2021-06-21");
        System.out.println(localDate5);

        LocalDate localDate6 = localDate5.plusDays(10);
        System.out.println(localDate6);

        LocalDate localDate7 = localDate5.minus(2, ChronoUnit.DAYS);
        System.out.println(localDate7);
    }
}
