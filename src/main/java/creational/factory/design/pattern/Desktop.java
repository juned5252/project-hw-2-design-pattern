package creational.factory.design.pattern;

public class Desktop implements Device {
    @Override
    public void screenRange() {
        System.out.println("Desktop screen range : 15-32in");
    }

    @Override
    public void priceRange() {
        System.out.println("Desktop price range : $150-2000");
    }
}
