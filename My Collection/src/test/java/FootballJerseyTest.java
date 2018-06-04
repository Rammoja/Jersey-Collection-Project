import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FootballJerseyTest {

    FootballJersey footballJersey;

    @Before
    public void before(){
        footballJersey = new FootballJersey("Jersey", 50.00, 5.00, 55.00, 05, 2013, "Scotland");

    }

    @Test
    public void hasItemType(){
        assertEquals( "Jersey", footballJersey.getItemType());
    }

    @Test
    public void hasBuying(){
        assertEquals( 50.00, footballJersey.getBuying(), 0.01);
    }

    @Test
    public void hasShippinh(){
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
