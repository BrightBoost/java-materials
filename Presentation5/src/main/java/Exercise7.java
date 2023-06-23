import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercise7 {
    public static void main(String[] args) {
        // Create teams
        Team team1 = new Team("Team 1");
        Team team2 = new Team("Team 2");
        Team team3 = new Team("Team 3");
        Team team4 = new Team("Team 4");

        // Create tournament
        Tournament tournament = new Tournament();

        // Add teams to tournament
        tournament.addTeam(team1);
        tournament.addTeam(team2);
        tournament.addTeam(team3);
        tournament.addTeam(team4);

        // Run tournament
        tournament.run();
    }
}

class Team {
    private String name;
    private int score;

    public Team(String name) {
        this.name = name;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void updateScore(int points) {
        score += points;
    }
}

class Game {
    private Team team1;
    private Team team2;
    private int score;

    public Game(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
        this.score = 0;
    }

    public void play() {
        // Simulating the game and determining the winner
        Random random = new Random();
        int team1Score = random.nextInt(5);
        int team2Score = random.nextInt(5);

        score = team1Score + team2Score;

        if (team1Score > team2Score) {
            team1.updateScore(3);
        } else if (team2Score > team1Score) {
            team2.updateScore(3);
        } else {
            team1.updateScore(1);
            team2.updateScore(1);
        }
    }

    public int getScore() {
        return score;
    }

    public Team getTeam1() {
        return team1;
    }

    public Team getTeam2() {
        return team2;
    }
}

class Round {
    private List<Game> games;

    public Round() {
        games = new ArrayList<>();
    }

    public void addGame(Game game) {
        games.add(game);
    }

    public void playGames() {
        for (Game game : games) {
            game.play();
        }
    }

    public List<Team> getWinners() {
        List<Team> winners = new ArrayList<>();

        for (Game game : games) {
            if (game.getTeam1().getScore() > game.getTeam2().getScore()) {
                winners.add(game.getTeam1());
            } else if (game.getTeam2().getScore() > game.getTeam1().getScore()) {
                winners.add(game.getTeam2());
            } else {
                // Handle tie situation if needed
            }
        }

        return winners;
    }
}

class Tournament {
    private List<Team> teams;
    private List<Round> rounds;

    public Tournament() {
        teams = new ArrayList<>();
        rounds = new ArrayList<>();
    }

    public void addTeam(Team team) {
        teams.add(team);
    }

    public void run() {
        int numTeams = teams.size();
        int numRounds = (int) Math.ceil(Math.log(numTeams) / Math.log(2));

        for (int i = 0; i < numRounds; i++) {
            Round round = new Round();
            int numGames = (int) Math.pow(2, numRounds - i - 1);

            for (int j = 0; j < numGames; j++) {
                int teamIndex1 = j * 2;
                int teamIndex2 = j * 2 + 1;

                Team team1 = teams.get(teamIndex1);
                Team team2 = teams.get(teamIndex2);

                Game game = new Game(team1, team2);
                round.addGame(game);
            }

            round.playGames();
            rounds.add(round);
        }

        // Print winners of each round
        for (int i = 0; i < rounds.size(); i++) {
            Round round = rounds.get(i);
            List<Team> winners = round.getWinners();

            System.out.println("Round " + (i + 1) + " winners:");
            for (Team team : winners) {
                System.out.println(team.getName());
            }
            System.out.println();
        }
    }
}
