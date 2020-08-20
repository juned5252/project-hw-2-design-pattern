package creational.factory.design.pattern;

public class Laptop  implements Device{
    @Override
    public void screenRange() {
        System.out.println("Laptop screen range : 11-18in");
    }

    @Override
    public void priceRange() {
        System.out.println("Laptop price range : $150-3000");
    }
}
