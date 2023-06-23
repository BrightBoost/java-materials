import java.util.*;
import java.util.stream.Collectors;

public class Exercise16 {
    public static void main(String[] args) {
        List<Team> teams = new ArrayList<>();
        // Populate the teams list

        // Filter teams based on a criteria (e.g., score > 100)
        List<Team> filteredTeams = teams.stream()
                .filter(team -> team.getScore() > 100)
                .collect(Collectors.toList());

        // Map teams to their names
        List<String> teamNames = teams.stream()
                .map(Team::getName)
                .collect(Collectors.toList());

        // Find the team with the highest score
        Optional<Team> teamWithHighestScore = teams.stream()
                .max(Comparator.comparingInt(Team::getScore));

        // Group teams by region and calculate the average score
        Map<String, Double> averageScoreByRegion = teams.stream()
                .collect(Collectors.groupingBy(Team::getRegion,
                        Collectors.averagingInt(Team::getScore)));

        // Print the filtered teams, team names, team with highest score, and average score by region
        System.out.println("Filtered Teams: " + filteredTeams);
        System.out.println("Team Names: " + teamNames);
        teamWithHighestScore.ifPresent(team -> System.out.println("Team with Highest Score: " + team));
        System.out.println("Average Score by Region: " + averageScoreByRegion);
    }

    // Define the Team class
   
}
 class Team {
        private String name;
        private int score;
        private String region;

        public Team(String name, int score, String region) {
            this.name = name;
            this.score = score;
            this.region = region;
        }

        public String getName() {
            return name;
        }

        public int getScore() {
            return score;
        }

        public String getRegion() {
            return region;
        }

        @Override
        public String toString() {
            return "Team{" +
                    "name='" + name + '\'' +
                    ", score=" + score +
                    ", region='" + region + '\'' +
                    '}';
        }
    }