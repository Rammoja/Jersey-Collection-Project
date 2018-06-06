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

    public void canGetDuckType(){
        assertEquals("Donut Duck", rubberDuck.getDuckType());

    }
}
