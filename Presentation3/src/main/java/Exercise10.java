import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Exercise10 {
    public static void main(String[] args) {
        // Create LocalDateTime of the current time
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current LocalDateTime: " + now);

        // Create a duration of favorite number of hours
        Duration favoriteDuration = Duration.ofHours(5);

        // Add the duration to the current time
        LocalDateTime newDateTime = now.plus(favoriteDuration);
        System.out.println("New LocalDateTime after adding duration: " + newDateTime);

        // Convert LocalDate to LocalDateTime before adding a duration
        LocalDate currentDate = LocalDate.now();
        LocalDateTime currentDateTime = currentDate.atStartOfDay();
        LocalDateTime newDateTimeWithDuration = currentDateTime.plus(favoriteDuration);
        System.out.println("New LocalDateTime after adding duration to LocalDate: " + newDateTimeWithDuration);

        // Calculate days, seconds, and weeks between two dates
        LocalDate birthDate = LocalDate.of(1990, 5, 15);
        long daysOld = ChronoUnit.DAYS.between(birthDate, currentDate);
        long secondsOld = ChronoUnit.SECONDS.between(birthDate.atStartOfDay(), now);
        long weeksOld = ChronoUnit.WEEKS.between(birthDate, currentDate);

        System.out.println("Days old: " + daysOld);
        System.out.println("Seconds old: " + secondsOld);
        System.out.println("Weeks old: " + weeksOld);
    }
}
