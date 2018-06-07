public class FootballBoot extends Item {

    private String brand;
    private FootballBootType footballBootType;


    public FootballBoot(String itemType, double buying, double shipping, double marketValue, int month, int year, String brand, double selling, FootballBootType footballBootType) {
        super(itemType, buying, shipping, marketValue, month, year, selling);
        this.brand = brand;
        this.footballBootType = footballBootType;
    }


    public String getBrand() {
        return brand;
    }

    public FootballBootType getFootballBootType() {
        return footballBootType;
    }
}
