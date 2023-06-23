import java.time.LocalDate;
import java.time.Period;

public class Exercise11 {

    public static void main(String[] args) {
        // Create a team
        Team team = new Team("Example Team", TeamStatus.ACTIVE);

        // Print team status using enum
        System.out.println("Team status: " + team.getStatus());

        // Check if team name has more than 10 characters
        if (team.getName().length() > 10) {
            System.out.println("Team name has more than 10 characters.");
        }

        // Create tournament and calculate the tournament duration
        LocalDate beginDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 12, 31);
        Tournament tournament = new Tournament(beginDate, endDate);
        Period tournamentDuration = tournament.getTournamentDuration();

        System.out.println("Tournament duration: " + tournamentDuration.getYears() + " years, " +
                tournamentDuration.getMonths() + " months, " + tournamentDuration.getDays() + " days.");
    }
}

enum TeamStatus {
    ACTIVE, ELIMINATED, CHAMPION
}

class Team {
    private String name;
    private TeamStatus status;

    public Team(String name, TeamStatus status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public TeamStatus getStatus() {
        return status;
    }
}

class Tournament {
    private LocalDate beginDate;
    private LocalDate endDate;

    public Tournament(LocalDate beginDate, LocalDate endDate) {
        this.beginDate = beginDate;
        this.endDate = endDate;
    }

    public Period getTournamentDuration() {
        return Period.between(beginDate, endDate);
    }
}
