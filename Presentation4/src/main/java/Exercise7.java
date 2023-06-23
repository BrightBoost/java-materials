import java.util.ArrayList;
import java.util.List;

public class Exercise7 {
    public static void main(String[] args) {
        Tournament tournament = new Tournament();

        // Create team objects
        Team team1 = new Team("Team 1");
        Team team2 = new Team("Team 2");

        // Assign teams to the tournament
        tournament.addTeam(team1);
        tournament.addTeam(team2);

        // Print the names of the players for each team
        for (Team team : tournament.getTeams()) {
            System.out.println("Players of " + team.getName() + ":");
            for (Player player : team.getPlayers()) {
                System.out.println(player.getName());
            }
        }

        // Create game and score objects
        Game game = new Game(team1, team2);
        Score score = new Score(3, 2); // Example scores

        // Calculate the total number of goals
        int totalGoals = score.getHomeGoals() + score.getAwayGoals();
        System.out.println("Total number of goals in the game: " + totalGoals);

        // Do you need classes with generics inside your project?
        // It depends on the specific requirements of your project. Generics can be useful when you want to create
        // reusable code that can work with different types. If you have scenarios where you need to store and
        // manipulate collections of different types (e.g., teams, players, scores), using generics can provide type
        // safety and flexibility. Consider the specific needs of your project and use generics where appropriate.
    }
}

class Tournament {
    private List<Team> teams;

    public Tournament() {
        teams = new ArrayList<>();
    }

    public void addTeam(Team team) {
        teams.add(team);
    }

    public List<Team> getTeams() {
        return teams;
    }
}

class Team {
    private String name;
    private List<Player> players;

    public Team(String name) {
        this.name = name;
        players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public String getName() {
        return name;
    }

    public List<Player> getPlayers() {
        return players;
    }
}

class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Game {
    private Team homeTeam;
    private Team awayTeam;

    public Game(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    // Other methods and properties of Game class
}

class Score {
    private int homeGoals;
    private int awayGoals;

    public Score(int homeGoals, int awayGoals) {
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;
    }

    public int getHomeGoals() {
        return homeGoals;
    }

    public int getAwayGoals() {
        return awayGoals;
    }
}
