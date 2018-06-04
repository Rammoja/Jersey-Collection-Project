public class FootballShoe extends Item {

    private String brand;


    public FootballShoe(String itemType, double buying, double shipping, double marketValue, int month, int year, String brand) {
        super(itemType, buying, shipping, marketValue, month, year);
        this.brand = brand;
    }


    public String getBrand() {
        return brand;
    }
}
