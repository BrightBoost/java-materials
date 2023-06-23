import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exercise12 {
    public static void main(String[] args) {
        int numTeams = 8; // Number of teams in the tournament
        int numRounds = (int) (Math.log(numTeams) / Math.log(2)); // Number of rounds in the tournament

        List<Team> teams = createTeams(numTeams);
        ConcurrentMap<Integer, List<Team>> results = new ConcurrentHashMap<>();

        ExecutorService executor = Executors.newFixedThreadPool(numTeams);

        for (int round = 1; round <= numRounds; round++) {
            CyclicBarrier roundBarrier = new CyclicBarrier(numTeams);
            System.out.println("Round " + round + " starts...");

            for (int match = 0; match < numTeams / 2; match++) {
                final int currentMatch = match;
                final int currentRound = round;

                executor.submit(() -> {
                    Team teamA = teams.get(currentMatch * 2);
                    Team teamB = teams.get(currentMatch * 2 + 1);

                    playMatch(teamA, teamB, currentRound, results);
                    try {
                        roundBarrier.await(); // Wait for all matches of the round to finish
                    } catch (InterruptedException | BrokenBarrierException e) {
                        e.printStackTrace();
                    }
                });
            }

            try {
                roundBarrier.await(); // Wait for all matches to complete in this round
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }

            System.out.println("Round " + round + " completed.");
            System.out.println();
        }

        executor.shutdown();

        // Print tournament results
        System.out.println("Tournament Results:");
        for (int round = 1; round <= numRounds; round++) {
            System.out.println("Round " + round + ":");
            List<Team> roundResults = results.get(round);
            for (Team team : roundResults) {
                System.out.println(team.getName() + " - Points: " + team.getPoints());
            }
            System.out.println();
        }
    }

    private static List<Team> createTeams(int numTeams) {
        List<Team> teams = new ArrayList<>();
        for (int i = 1; i <= numTeams; i++) {
            Team team = new Team("Team " + i);
            teams.add(team);
        }
        return teams;
    }

    private static void playMatch(Team teamA, Team teamB, int round, ConcurrentMap<Integer, List<Team>> results) {
        Random random = new Random();
        int scoreA = random.nextInt(5);
        int scoreB = random.nextInt(5);

        if (scoreA > scoreB) {
            teamA.addPoints(3);
        } else if (scoreB > scoreA) {
            teamB.addPoints(3);
        } else {
            teamA.addPoints(1);
            teamB.addPoints(1);
        }

        System.out.println(teamA.getName() + " vs " + teamB.getName() + ": " + scoreA + " - " + scoreB);

        // Update round results
        results.computeIfAbsent(round, k -> new ArrayList<>());
        results.get(round).add(teamA);
        results.get(round).add(teamB);
    }

}

class Team {
    private String name;
    private int points;

    public Team(String name) {
        this.name = name;
        this.points = 0;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public void addPoints(int points) {
        this.points += points;
    }
}