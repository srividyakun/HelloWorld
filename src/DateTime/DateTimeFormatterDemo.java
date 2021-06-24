package DateTime;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateTimeFormatterDemo {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.of(2021, Month.AUGUST,16,12,0,0);

        String isoDate = localDateTime.format(DateTimeFormatter.ISO_DATE);
        System.out.println(isoDate);

        String isoTime = localDateTime.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(isoTime);

        String patternedTime = localDateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss"));
        System.out.println(patternedTime);

        String  format = localDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.UK));
        System.out.println(format);
    }
}
