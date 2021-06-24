package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class ConverOldDateToNewDateDemo {
    public static void main(String[] args) {

        //Convert Date
        Date date = new Date();
        System.out.println(date);

        LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        System.out.println(localDateTime);

        LocalTime localTime = localDateTime.toLocalTime();
        System.out.println(localTime);

        LocalDate localDate = localDateTime.toLocalDate();
        System.out.println(localDate);


        //convert calendar
        Calendar calendar = Calendar.getInstance();

        LocalDateTime localDateTime1 = LocalDateTime.ofInstant(calendar.toInstant(),ZoneId.systemDefault());
        System.out.println(localDateTime1);
    }
}
