public class RubberDuck extends Item{
    private String duckType;

    public RubberDuck(String itemType, double buying, double shipping, double marketValue, int month, int year, double selling, String duckType){
        super (itemType, buying, shipping, marketValue, month, year, selling);
        this.duckType = duckType;
    }

    public String getDuckType(){
        return duckType;
    }



}
