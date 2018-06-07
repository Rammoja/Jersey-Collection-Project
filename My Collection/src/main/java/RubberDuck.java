public class RubberDuck extends Item{
    private String duckName;

    public RubberDuck(String itemType, double buying, double shipping, double marketValue, int month, int year, double selling, String duckName){
        super (itemType, buying, shipping, marketValue, month, year, selling);
        this.duckName = duckName;
    }

    public String getDuckName(){
        return duckName;
    }



}
