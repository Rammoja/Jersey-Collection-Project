import com.sun.tools.corba.se.idl.constExpr.Equal;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RubberDuckTest {

    RubberDuck rubberDuck;

    @Before
    public void before() {
        rubberDuck = new RubberDuck ("Rubber Duck", 10.00, 2.00, 12.00, 02, 2017, 14.00, "Donut Duck" );
    }

    @Test
    public void canGetDuckName(){
        assertEquals("Donut Duck", rubberDuck.getDuckName());
    }

    @Test
    public void canGetBuyingPrice(){
        assertEquals(10.00, rubberDuck.getBuying(),0.01);
    }

    @Test
    public void  canGetShippingPrice(){
        assertEquals(2.00, rubberDuck.getShipping(),0.01);
    }

    @Test
    public void canGetMarketValue(){
        assertEquals(12.00, rubberDuck.getMarketValue(),0.01);
    }

    @Test
    public void canGetMonth(){
        assertEquals(02, rubberDuck.getMonth());
    }

    @Test
    public void canGetYear(){
        assertEquals(2017, rubberDuck.getYear());
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(14, rubberDuck.sellItem(),0.01);
    }
}
