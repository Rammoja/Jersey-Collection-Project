public class FootballJersey extends Item {

    private String teamName;


    public FootballJersey(String itemType, double buying, double shipping, double marketValue, int month, int year, String teamName) {
        super(itemType, buying, shipping, marketValue, month, year);
        this.teamName = teamName;

    }

    public String getTeamName() {
        return teamName;
    }
}
