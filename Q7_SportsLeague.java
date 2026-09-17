class Team {
    String name;
    int matchesPlayed, wins, draws;

    Team(String name, int matchesPlayed, int wins, int draws) {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.wins = wins;
        this.draws = draws;
    }

    int calculatePoints() {
        return 0;
    }
}

class CricketTeam extends Team {

    CricketTeam(String name, int matchesPlayed, int wins, int draws) {
        super(name, matchesPlayed, wins, draws);
    }

    @Override
    int calculatePoints() {
        return (wins * 2) + draws;
    }
}

class FootballTeam extends Team {

    FootballTeam(String name, int matchesPlayed, int wins, int draws) {
        super(name, matchesPlayed, wins, draws);
    }

    @Override
    int calculatePoints() {
        return (wins * 3) + draws;
    }
}

public class Q7_SportsLeague {

    public static void main(String[] args) {

        Team cricket = new CricketTeam("India", 10, 6, 2);
        Team football = new FootballTeam("Barcelona", 8, 6, 1);

        System.out.println("Team: " + cricket.name +
                " (Cricket) Points: " + cricket.calculatePoints());

        System.out.println("Team: " + football.name +
                " (Football) Points: " + football.calculatePoints());
    }
}