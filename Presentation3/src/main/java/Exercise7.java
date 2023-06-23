import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Exercise7 {
    public static void main(String[] args) {
        LocalDateTime currentTime = LocalDateTime.now();
        LocalDate birthDate = LocalDate.of(1990, 5, 15);
        LocalDateTime meetingTime = LocalDateTime.of(2023, 6, 30, 14, 30);
        LocalTime onlineMeetingTime = LocalTime.of(9, 0);

        System.out.println("Current Time: " + currentTime);
        System.out.println("Birth Date: " + birthDate);
        System.out.println("Meeting Time: " + meetingTime);
        System.out.println("Online Meeting Time: " + onlineMeetingTime);
    }
}
