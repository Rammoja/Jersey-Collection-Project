import java.security.PrivateKey;

public abstract class Item {


    private String itemType;
    private double buying;
    private double shipping;
    private double marketValue;
    private int datePurchase;

    public Item (String itemType, double buying, double shipping, double marketValue, int datePurchase) {
        this.itemType = itemType;
        this.buying = buying;
        this.shipping = shipping;
        this.marketValue = marketValue;
        this.datePurchase = datePurchase;
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

    public int getDatePurchase() {
        return datePurchase;
    }
}
