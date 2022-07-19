public class BeverageProduct extends GroceryProduct implements Drinakble {

    private SugarLevel SugarLevel;

    public BeverageProduct(String name, double price, double discount, SugarLevel SugarLevel) {
        super(name, price, discount);
        this.SugarLevel = SugarLevel;
    }

    public SugarLevel getSugarLevel() {
        return SugarLevel;
    }

    public void setSugarLevel(SugarLevel sugarLevel) {
        SugarLevel = sugarLevel;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "Sugar Level " + SugarLevel;
    }

    @Override
    public boolean isHealthy() {
        return SugarLevel = SugarLevel.ADDED_SUGAR;
    }    
}
