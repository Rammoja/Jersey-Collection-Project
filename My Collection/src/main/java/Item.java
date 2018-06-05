import java.security.PrivateKey;

public abstract class Item {


    private String itemType;
    private double buying;
    private double shipping;
    private double marketValue;
    private int month;
    private int year;


    public Item (String itemType, double buying, double shipping, double marketValue, int month, int year) {
        this.itemType = itemType;
        this.buying = buying;
        this.shipping = shipping;
        this.marketValue = marketValue;
        this.month = month;
        this.year = year;
    }

    public String getItemType() {
        return itemType;
    }

    public double getBuying() {
        return buying;
    }

    public double getShipping() {
        return shipping;
    }

    public double getMarketValue() {
        return marketValue;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public double calculateTotalJerseyPrice() {
        return this.buying + this.shipping;
    }

    public double calculateMarkupPrice(double TotalJerseyPrice) {
        return this.marketValue - TotalJerseyPrice;
    }

}
