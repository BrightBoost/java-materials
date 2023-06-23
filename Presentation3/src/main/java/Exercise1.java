public class Exercise1 {
    public static void main(String[] args) {
        // Create teams
        Team team1 = new Team("Team A");
        Team team2 = new Team("Team B");

        // Print initial team names
        System.out.println("Team 1 name: " + team1.getName());
        System.out.println("Team 2 name: " + team2.getName());

        // Reverse and lowercase team names
        team1.reverseAndLowercaseName();
        team2.reverseAndLowercaseName();

        // Print modified team names
        System.out.println("Modified team 1 name: " + team1.getName());
        System.out.println("Modified team 2 name: " + team2.getName());

        // Change the score of a game
        Game game = new Game(team1, team2, 0, 0);
        game.setScore(3, 1);
        System.out.println("Game score: " + game.getScore());
    }

}

class Team {
    private String name;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void reverseAndLowercaseName() {
        name = new java.lang.StringBuilder(name).reverse().toString().toLowerCase();
    }
}

class Game {
    private Team team1;
    private Team team2;
    private int scoreTeam1;
    private int scoreTeam2;

    public Game(Team team1, Team team2, int scoreTeam1, int scoreTeam2) {
        this.team1 = team1;
        this.team2 = team2;
        this.scoreTeam1 = scoreTeam1;
        this.scoreTeam2 = scoreTeam2;
    }

    public void setScore(int scoreTeam1, int scoreTeam2) {
        this.scoreTeam1 = scoreTeam1;
        this.scoreTeam2 = scoreTeam2;
    }

    public String getScore() {
        return team1.getName() + " " + scoreTeam1 + " - " + scoreTeam2 + " " + team2.getName();
    }
}