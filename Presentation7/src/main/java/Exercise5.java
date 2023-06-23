import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Team {
    private String name;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Game {
    private Team team1;
    private Team team2;
    private int score1;
    private int score2;

    public Game(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    public void playGame() {
        score1 = generateRandomScore();
        score2 = generateRandomScore();
    }

    private int generateRandomScore() {
        return (int) (Math.random() * 10);
    }

    public String getWinner() {
        if (score1 > score2) {
            return team1.getName();
        } else if (score1 < score2) {
            return team2.getName();
        } else {
            return "Draw";
        }
    }

    public String getScores() {
        return team1.getName() + " " + score1 + " - " + score2 + " " + team2.getName();
    }
}

class Round {
    private List<Team> teams;
    private List<Game> games;

    public Round(List<Team> teams) {
        this.teams = teams;
        games = new ArrayList<>();
    }

    public void assignTeamsAndPlayGames() throws InsufficientTeamsException {
        if (teams.size() < 2) {
            throw new InsufficientTeamsException("Not enough teams to play the round.");
        }

        int numGames = teams.size() / 2;
        for (int i = 0; i < numGames; i++) {
            Team team1 = teams.get(i * 2);
            Team team2 = teams.get(i * 2 + 1);
            Game game = new Game(team1, team2);
            game.playGame();
            games.add(game);
        }
    }

    public List<Game> getGames() {
        return games;
    }
}

class Tournament {
    private List<Team> teams;
    private List<Round> rounds;

    public Tournament(List<Team> teams) {
        this.teams = teams;
        rounds = new ArrayList<>();
    }

    public void runTournament() throws InsufficientTeamsException {
        if (teams.size() < 2) {
            throw new InsufficientTeamsException("Not enough teams to run the tournament.");
        }

        int numRounds = (int) Math.ceil(Math.log(teams.size()) / Math.log(2));
        for (int i = 0; i < numRounds; i++) {
            Round round = new Round(teams);
            round.assignTeamsAndPlayGames();
            rounds.add(round);
        }
    }

    public List<Round> getRounds() {
        return rounds;
    }
}

class InsufficientTeamsException extends Exception {
    public InsufficientTeamsException(String message) {
        super(message);
    }
}

public class Exercise5 {
    public static void main(String[] args) {
        List<Team> teams = new ArrayList<>();
        teams.add(new Team("Team A"));
        teams.add(new Team("Team B"));
        teams.add(new Team("Team C"));
        teams.add(new Team("Team D"));

        Tournament tournament = new Tournament(teams);
        try {
            tournament.runTournament();
            writeResultsToFile(tournament.getRounds(), "tournament_results.txt");
        } catch (InsufficientTeamsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void writeResultsToFile(List<Round> rounds, String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {
            for (int i = 0; i < rounds.size(); i++) {
                Round round = rounds.get(i);
                writer.write("Round " + (i + 1) + ":\n");
                List<Game> games = round.getGames();
                for (Game game : games) {
                    writer.write(game.getScores() + " - Winner: " + game.getWinner() + "\n");
                }
                writer.write("\n");
            }
            System.out.println("Tournament results written to file: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
