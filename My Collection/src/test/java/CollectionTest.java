import org.junit.Before;
import org.junit.Test;

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
        item = new FootballJersey( "FootBall Jersey", 50.00, 5.00, 58.00, 05, 2013, "SCOTLAND", LeagueJersey.WORLDCUP);
        item1 = new FootballJersey( "FootBall Jersey", 50.00, 5.00, 60.00, 02, 2015, "GERMANY", LeagueJersey.WORLDCUP);
        item2 = new FootballShoe("Shoes", 60.00, 3.00, 70, 8, 2017,"NIKE", FootballShoeType.OUTDOOR);
        item3 = new FootballShoe("Shoes", 47.00, 3.00, 52, 4, 2016,"PUMA", FootballShoeType.OUTDOOR);
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
        assertEquals(110.00, collection.CollectionCost(),0.01);
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
        assertEquals(223.00, collection.CollectionCost(),0.01);
    }

    @Test
    public void canRemoveItemFromCollection(){
        collection.addToCollection(item2);
        collection.removeFromCollection(item2);
        assertEquals(0,collection.itemCollectionCount());
    }

    @Test
    public void canGetOverallProfit(){
        collection.addToCollection(item);
        collection.addToCollection(item1);
        collection.addToCollection(item2);
        collection.addToCollection(item3);
        assertEquals(17.00,collection.possibleProfit(),0.01);
    }





}
