import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FootballJerseyTest {

    FootballJersey footballJersey;

    @Before
    public void before(){
        footballJersey = new FootballJersey("Football Jersey", 50.00, 5.00, 55.00, 05, 2013, "SCOTLAND");

    }

    @Test
    public void hasItemType(){
        assertEquals( "Football Jersey", footballJersey.getItemType());
    }

    @Test
    public void canGetBuyingPrice(){
        assertEquals( 50.00, footballJersey.getBuying(), 0.01);
    }

    @Test
    public void canGetShippingPrice(){
        assertEquals( 5.00, footballJersey.getShipping(), 0.01);
    }

    @Test
    public void hasMarketValue(){
        assertEquals( 55.00, footballJersey.getMarketValue(), 0.01);
    }

    @Test
    public void canGetMonth(){
        assertEquals( 05, footballJersey.getMonth());
    }

    @Test
    public void canGetYear(){
        assertEquals( 2013, footballJersey.getYear());
    }



    @Test
    public void canGetTeamName(){
        assertEquals( "Scotland", footballJersey.getTeamName());
    }

}
