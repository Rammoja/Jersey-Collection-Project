public class FootballJersey extends Item {

    private String teamName;
    private LeagueJersey leagueJersey;



    public FootballJersey(String itemType, double buying, double shipping, double marketValue, int month, int year, String teamName, LeagueJersey leagueJersey, double selling) {
        super(itemType, buying, shipping, marketValue, month, year, selling);
        this.teamName = teamName;
        this.leagueJersey = leagueJersey;

    }

    public String getTeamName() {
        return teamName;
    }

    public LeagueJersey getLeagueJerseyType() {
        return leagueJersey;
    }

}
