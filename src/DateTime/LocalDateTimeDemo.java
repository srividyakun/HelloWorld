package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeDemo {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println(localDateTime1);

        LocalDateTime localDateTime2 = LocalDateTime.parse("2021-06-22T08:57:58");
        System.out.println(localDateTime2);

        LocalTime localDateTime3 = localDateTime2.toLocalTime();
        System.out.println(localDateTime3);

        LocalDate localDateTime4 = localDateTime2.toLocalDate();
        System.out.println(localDateTime4);

    }
}
