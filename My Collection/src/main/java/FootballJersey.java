public class FootballJersey extends Item {

    private String teamName;


    public FootballJersey(String itemType, double buying, double shipping, double marketValue, int datePurchase, String teamName) {
        super(itemType, buying, shipping, marketValue, datePurchase);
        this.teamName = teamName;

    }

    public String getTeamName() {
        return teamName;
    }
}
