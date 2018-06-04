import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CollectionTest {

    Collection collection;


    @Before
    public void before() {
        collection = new Collection();
    }


    @Test
    public void setItemCollectionCount() {
        assertEquals(0, collection.itemCollectionCount());
    }

}
