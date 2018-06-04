import java.util.ArrayList;

public class Collection {

    private ArrayList<Item> items;

    public Collection(){
        this.items = new ArrayList<Item>();
    }


    public int itemCollectionCount() {
        return this.items.size();
    }

    public void addToCollection(Item item) {
        this.items.add(item);
    }

    private ArrayList<Item> TotalCostOfCollection(){
        return this.items;
    }
}
