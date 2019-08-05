public class Espresso implements Beverage {
    
    String description;

    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
    
    public String getDescription() {
        return description;
    }
}