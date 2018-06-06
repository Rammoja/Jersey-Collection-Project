import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FootballShoeTest {

    FootballShoe footballShoe;


    @Before
    public void before() {
        footballShoe = new FootballShoe("Shoe", 60.00, 3.00, 70.00, 8, 2017, "NIKE", FootballShoeType.OUTDOOR);
    }

    @Test
    public void canGetBrand(){
        assertEquals("NIKE", footballShoe.getBrand());
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

    @Test
    public void calculateFootballShoePrice(){
        assertEquals(63.00, footballShoe.calculateTotalItemPrice(),0.01);
    }

    @Test
    public void calculateMarkupPrice(){
        double result = footballShoe.calculateTotalItemPrice();
        assertEquals(7.00, footballShoe.calculateMarkupPrice(result), 0.01);
    }

    @Test
    public void itemForResale(){
        assertEquals(false, footballShoe.itemResaleStatus());
    }

    @Test
    public void canChangeResaleStatus(){
        footballShoe.changeResaleStatus();
        assertEquals(true, footballShoe.itemResaleStatus());
    }

    @Test
    public void itemIsFavourite(){
        assertEquals(false, footballShoe.itemIsFavouriteStatus());
    }

    @Test
    public void changeFavouriteItem(){
        footballShoe.changeFavouriteItemStatus();
        assertEquals(true, footballShoe.itemIsFavouriteStatus());
    }

    @Test
    public void canGetFootballShoeType(){
        assertEquals(FootballShoeType.OUTDOOR, footballShoe.getFootballShoeType());
    }


}
