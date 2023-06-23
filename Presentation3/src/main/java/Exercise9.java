import java.time.LocalDate;
import java.time.Period;

public class Exercise9 {
    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(1995, 10, 14);
        LocalDate currentDate = LocalDate.now();

        // Calculate period between birth date and current date
        Period period = Period.between(birthDate, currentDate);
        System.out.println("Period between birth date and current date: " + period);

        // Create and print a period
        Period customPeriod = Period.ofMonths(3).ofDays(1);
        System.out.println("Custom period: " + customPeriod);

        // Create a period of 2 weeks
        Period twoWeeksPeriod = Period.ofWeeks(2);
        System.out.println("Two weeks period: " + twoWeeksPeriod);

        // Add a period of one month to February 28th
        LocalDate feb28th = LocalDate.of(2023, 2, 28);
        LocalDate newDate1 = feb28th.plus(Period.ofMonths(1));
        System.out.println("New date after adding one month to February 28th: " + newDate1);

        // Add a period of one month to January 30th
        LocalDate jan30th = LocalDate.of(2023, 1, 30);
        LocalDate newDate2 = jan30th.plus(Period.ofMonths(1));
        System.out.println("New date after adding one month to January 30th: " + newDate2);
    }
}
