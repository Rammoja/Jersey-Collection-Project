public class FootballShoe extends Item {

    private String brand;
    private FootballShoeType footballShoeType;


    public FootballShoe(String itemType, double buying, double shipping, double marketValue, int month, int year, String brand, FootballShoeType footballShoeType) {
        super(itemType, buying, shipping, marketValue, month, year);
        this.brand = brand;
        this.footballShoeType = footballShoeType;
    }


    public String getBrand() {
        return brand;
    }

    public FootballShoeType getFootballShoeType() {
        return footballShoeType;
    }
}
