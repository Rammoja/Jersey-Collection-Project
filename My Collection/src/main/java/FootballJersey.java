import sun.dc.pr.PRError;

public class FootballJersey extends Item {

    private String teamName;
    private JerseyLeagues jerseyLeagues;



    public FootballJersey(String itemType, double buying, double shipping, double marketValue, int month, int year, String teamName, JerseyLeagues jerseyLeagues) {
        super(itemType, buying, shipping, marketValue, month, year);
        this.teamName = teamName;
        this.jerseyLeagues = jerseyLeagues;

    }

    public String getTeamName() {
        return teamName;
    }

    public JerseyLeagues getJerseyLeagueType() {
        return jerseyLeagues;
    }

}
