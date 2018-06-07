import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CollectionTest {

    Collection collection;
    Item item;
    Item item1;
    Item item2;
    Item item3;
    Item item4;


    @Before
    public void before() {
        collection = new Collection();
        item = new FootballJersey("FootBall Jersey", 50.00, 5.00, 58.00, 5, 2013, "Manchester UTD", LeagueJersey.ENGLISHPREMIRE, 60.00);
        item1 = new FootballJersey("FootBall Jersey", 50.00, 5.00, 60.00, 2, 2015, "GERMANY", LeagueJersey.WORLDCUP, 65.00);
        item2 = new FootballBoot("Boots", 60.00, 3.00, 70.00, 8, 2017, "NIKE", FootballBootType.OUTDOOR, 73.00);
        item3 = new FootballBoot("Boots", 47.00, 3.00, 52.00, 4, 2016, "PUMA", FootballBootType.TUFF, 56.00);
        item4 = new RubberDuck("Rubber Duck", 8.00, 2.00, 11.00, 5, 2017, 13.00, "Nurse Duck");
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
    public void getCollectionCost() {
        collection.addToCollection(item);
        collection.addToCollection(item1);
        assertEquals(110.00, collection.CollectionCost(), 0.01);
    }

    @Test
    public void getYearOfItem() {
        assertEquals(2015, collection.itemYear(item1));
    }

    @Test
    public void getMonthOfItem() {
        assertEquals(02, collection.itemMonth(item1));
    }


    @Test
    public void canAddAllToCollection() {
        collection.addToCollection(item);
        collection.addToCollection(item1);
        collection.addToCollection(item2);
        collection.addToCollection(item3);
        collection.addToCollection(item4);
        assertEquals(5, collection.itemCollectionCount());
    }


    @Test
    public void getAllCollectionCost() {
        collection.addToCollection(item);
        collection.addToCollection(item1);
        collection.addToCollection(item2);
        collection.addToCollection(item3);
        collection.addToCollection(item4);
        assertEquals(233.00, collection.CollectionCost(), 0.01);
    }

    @Test
    public void canRemoveItemFromCollection() {
        collection.addToCollection(item2);
        collection.removeFromCollection(item2);
        assertEquals(0, collection.itemCollectionCount());
    }

    @Test
    public void canGetPossibleProfit() {
        collection.addToCollection(item);
        collection.addToCollection(item1);
        collection.addToCollection(item2);
        collection.addToCollection(item3);
        collection.addToCollection(item4);
        assertEquals(18.00, collection.possibleProfit(), 0.01);
    }

    @Test
    public void canGetProfit() {
        collection.addToCollection(item);
        collection.addToCollection(item1);
        collection.addToCollection(item2);
        collection.addToCollection(item3);
        collection.addToCollection(item4);
        assertEquals(34.00, collection.getProfit(), 0.01);
    }


}
