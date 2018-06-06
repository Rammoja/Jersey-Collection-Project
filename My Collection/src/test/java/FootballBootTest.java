import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FootballBootTest {

    FootballBoot footballBoot;


    @Before
    public void before() {
        footballBoot = new FootballBoot("Shoe", 60.00, 3.00, 70.00, 8, 2017, "NIKE", FootballBootType.OUTDOOR, 72.00);
    }

    @Test
    public void canGetBrand(){
        assertEquals("NIKE", footballBoot.getBrand());
    }

    @Test
    public void canGetBuyingPrice(){
        assertEquals( 60.00, footballBoot.getBuying(), 0.01);
    }

    @Test
    public void canGetShippingPrice(){
        assertEquals( 3.00, footballBoot.getShipping(), 0.01);
    }

    @Test
    public void hasMarketValue(){
        assertEquals( 70.00, footballBoot.getMarketValue(), 0.01);
    }

    @Test
    public void canGetMonth(){
        assertEquals( 8, footballBoot.getMonth());
    }

    @Test
    public void canGetYear(){
        assertEquals( 2017, footballBoot.getYear());
    }

    @Test
    public void calculateFootballShoePrice(){
        assertEquals(63.00, footballBoot.calculateTotalItemPrice(),0.01);
    }

    @Test
    public void calculateMarkupPrice(){
        double result = footballBoot.calculateTotalItemPrice();
        assertEquals(9.00, footballBoot.calculateMarkupPrice(result), 0.01);
    }

    @Test
    public void itemForResale(){
        assertEquals(false, footballBoot.itemResaleStatus());
    }

    @Test
    public void canChangeResaleStatus(){
        footballBoot.changeResaleStatus();
        assertEquals(true, footballBoot.itemResaleStatus());
    }

    @Test
    public void itemIsFavourite(){
        assertEquals(false, footballBoot.itemIsFavouriteStatus());
    }

    @Test
    public void changeFavouriteItem(){
        footballBoot.changeFavouriteItemStatus();
        assertEquals(true, footballBoot.itemIsFavouriteStatus());
    }

    @Test
    public void canGetFootballBootType(){
        assertEquals(FootballBootType.OUTDOOR, footballBoot.getFootballBootType());
    }


}
