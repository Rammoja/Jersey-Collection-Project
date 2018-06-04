import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FootballShoeTest {

    FootballShoe footballShoe;


    @Before
    public void before() {
        footballShoe = new FootballShoe("Shoe", 60.00, 3.00, 70.00, 8, 2017, "Nike");
    }

    @Test
    public void canGetBrand(){
        assertEquals("Nike", footballShoe.getBrand());
    }





}
