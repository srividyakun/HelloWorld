package DateTime;

import java.time.*;
import java.util.Set;

public class ZonedDateTImeDemo {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("Asia/Tokyo");
        System.out.println(zoneId);

        Set<String> availableZoneId = ZoneId.getAvailableZoneIds();
        for(String zoneId1 : availableZoneId){
            System.out.println(zoneId1);
        }

        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(),zoneId);
        System.out.println(zonedDateTime);

        ZoneOffset offset = ZoneOffset.of("+02:00");
        System.out.println(offset);

        OffsetDateTime offsetDateTime = OffsetDateTime.of(LocalDateTime.now(),offset);
        System.out.println(offsetDateTime);
    }
}
