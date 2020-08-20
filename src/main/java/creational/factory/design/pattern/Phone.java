package creational.factory.design.pattern;

public class Phone implements Device {
    @Override
    public void screenRange() {
        System.out.println("Phone screen range : 4-7in");
    }

    @Override
    public void priceRange() {
        System.out.println("Phone price range : $150-2000");
    }
}
