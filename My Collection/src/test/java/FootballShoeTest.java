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

    @Test
    public void canGetBuyingPrice(){
        assertEquals( 60.00, footballShoe.getBuying(), 0.01);
    }

    @Test
    public void canGetShippingPrice(){
        assertEquals( 3.00, footballShoe.getShipping(), 0.01);
    }

    @Test
    public void hasMarketValue(){
        assertEquals( 70.00, footballShoe.getMarketValue(), 0.01);
    }

    @Test
    public void canGetMonth(){
        assertEquals( 8, footballShoe.getMonth());
    }

    @Test
    public void canGetYear(){
        assertEquals( 2017, footballShoe.getYear());
    }





}
