import java.util.List;
import java.util.ArrayList;

public class Exercise8 {
    public static void main(String[] args) {
        Team professionalTeam1 = new ProfessionalTeam("Team A");
        Team amateurTeam1 = new AmateurTeam("Team B");

        Game game1 = new Game(professionalTeam1, amateurTeam1);
        game1.play();

        Round round1 = new Round();
        round1.addGame(game1);
        round1.runRound();

        Tournament tournament = new Tournament();
        tournament.addRound(round1);
        tournament.runTournament();
    }
}

abstract class Team {
    private String name;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void celebrate();
}

class ProfessionalTeam extends Team {
    public ProfessionalTeam(String name) {
        super(name);
    }

    @Override
    public void celebrate() {
        System.out.println("Professional team is celebrating!");
    }
}

class AmateurTeam extends Team {
    public AmateurTeam(String name) {
        super(name);
    }

    @Override
    public void celebrate() {
        System.out.println("Amateur team is celebrating!");
    }
}

class Game {
    private Team team1;
    private Team team2;

    public Game(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    public void play() {
        // Game logic
        System.out.println("Game played between " + team1.getName() + " and " + team2.getName());
        determineWinner();
    }

    private void determineWinner() {
        // Determine winner logic
        // Set the score or declare a winning team
        // For simplicity, let's assume team1 is the winner
        System.out.println("Winner: " + team1.getName());
        team1.celebrate();
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

    public void runRound() {
        for (Game game : games) {
            game.play();
        }
    }
}

class Tournament {
    private List<Round> rounds;

    public Tournament() {
        rounds = new ArrayList<>();
    }

    public void addRound(Round round) {
        rounds.add(round);
    }

    public void runTournament() {
        for (Round round : rounds) {
            round.runRound();
        }
    }
}
