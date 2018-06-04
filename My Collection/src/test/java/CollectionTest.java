import com.sun.tools.javac.jvm.Items;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CollectionTest {

    Collection collection;
    Item item;
    Item item1;


    @Before
    public void before() {
        collection = new Collection();
        item = new FootballJersey( "FootBall Jersey", 50.00, 5.00, 55.00, 05, 2013, "Scotland");
        item1 = new FootballJersey( "FootBall Jersey", 50.00, 5.00, 55.00, 02, 2015, "Germany");
    }


    @Test
    public void setItemCollectionCount() {
        assertEquals(0, collection.itemCollectionCount());
    }

    @Test
    public void canAddToCollection() {
        collection.addToCollection(item);
        collection.addToCollection(item1);
        assertEquals(2, collection.itemCollectionCount());
    }

    @Test
    public void getItemCollectionCost(){
        collection.addToCollection(item);
        collection.addToCollection(item1);
        assertEquals(100.00, collection.itemCollectionCost(),0.01);
    }




}
