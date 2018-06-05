import com.sun.tools.javac.jvm.Items;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CollectionTest {

    Collection collection;
    Item item;
    Item item1;
    Item item2;
    Item item3;


    @Before
    public void before() {
        collection = new Collection();
        item = new FootballJersey( "FootBall Jersey", 50.00, 5.00, 55.00, 05, 2013, "SCOTLAND");
        item1 = new FootballJersey( "FootBall Jersey", 50.00, 5.00, 55.00, 02, 2015, "GERMANY");
        item2 = new FootballShoe("Shoes", 60.00, 3.00, 70, 8, 2017,"NIKE");
        item3 = new FootballShoe("Shoes", 47.00, 3.00, 52, 4, 2016,"PUMA");
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
    public void getCollectionCost(){
        collection.addToCollection(item);
        collection.addToCollection(item1);
        assertEquals(100.00, collection.CollectionCost(),0.01);
    }

    @Test
    public void getYearOfItem(){
        assertEquals(2015, collection.itemYear(item1));
    }

    @Test
    public void getMonthOfItem(){
        assertEquals(02, collection.itemMonth(item1));
    }


    @Test
    public void canAddAllToCollection() {
        collection.addToCollection(item);
        collection.addToCollection(item1);
        collection.addToCollection(item2);
        collection.addToCollection(item3);
        assertEquals(4, collection.itemCollectionCount());
    }


    @Test
    public void getAllCollectionCost(){
        collection.addToCollection(item);
        collection.addToCollection(item1);
        collection.addToCollection(item2);
        collection.addToCollection(item3);
        assertEquals(207.00, collection.CollectionCost(),0.01);
    }

    @Test
    public void canRemoveItemFromCollection(){
        collection.addToCollection(item2);
        collection.removeFromCollection(item2);
        assertEquals(0,collection.itemCollectionCount());
    }



}
