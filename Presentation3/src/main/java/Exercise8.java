import java.time.Duration;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class Exercise8 {
    public static void main(String[] args) {
        // Timestamps
        LocalDateTime timestamp1 = LocalDateTime.parse("2019-06-20T09:53");
        OffsetDateTime offsetDateTime1 = OffsetDateTime.of(timestamp1, ZoneOffset.of("-07:00"));

        LocalDateTime timestamp2 = LocalDateTime.parse("2019-06-20T03:45");
        OffsetDateTime offsetDateTime2 = OffsetDateTime.of(timestamp2, ZoneOffset.of("+02:00"));

        LocalDateTime timestamp3 = LocalDateTime.parse("2019-06-24T19:23");
        OffsetDateTime offsetDateTime3 = OffsetDateTime.of(timestamp3, ZoneOffset.of("+05:30"));

        LocalDateTime timestamp4 = LocalDateTime.parse("2019-06-25T13:56");
        OffsetDateTime offsetDateTime4 = OffsetDateTime.of(timestamp4, ZoneOffset.of("+02:00"));

        // Calculate hours apart
        long hoursApart1 = calculateHoursApart(offsetDateTime1, offsetDateTime2);
        long hoursApart2 = calculateHoursApart(offsetDateTime3, offsetDateTime4);

        // Print results
        System.out.println("Hours apart between timestamp 1 and timestamp 2: " + hoursApart1);
        System.out.println("Hours apart between timestamp 3 and timestamp 4: " + hoursApart2);
    }

    public static long calculateHoursApart(OffsetDateTime timestamp1, OffsetDateTime timestamp2) {
        Duration duration = Duration.between(timestamp1, timestamp2);
        long hoursApart = Math.abs(duration.toHours());
        return hoursApart;
    }
}
