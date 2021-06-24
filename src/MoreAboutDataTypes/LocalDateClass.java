package MoreAboutDataTypes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateClass {
    public static void main(String[] args) {
        LocalDate localDateClass = LocalDate.now();
        System.out.println(localDateClass);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        System.out.println("The formatted date is :"+localDateClass.format(dateTimeFormatter));

        String dateString = "07-04-2022";
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        LocalDate localDate = LocalDate.parse(dateString);
        System.out.println(localDate.parse(dateString,dateTimeFormatter1));

    }
}
