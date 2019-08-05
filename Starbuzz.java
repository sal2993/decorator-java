public class Starbuzz {
    public static void main(String[] args) {
        System.out.println("hello. welcome to Starbuzz");
        Beverage firstBev = new Espresso();
        System.out.println(firstBev.cost());
        firstBev = new Mocha(firstBev);
        System.out.println(firstBev.getDescription() + " cost: " + firstBev.cost());
    }
}