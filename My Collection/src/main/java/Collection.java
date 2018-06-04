import java.util.ArrayList;

public class Collection {

    private ArrayList<Item> item;

    public Collection(){
        this.item = new ArrayList<Item>();
    }


    public int itemCollectionCount() {
        return this.item.size();
    }
}
