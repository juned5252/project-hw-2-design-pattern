package creational.factory.design.pattern;

public class DeviceFactory {

        public static Device getDevice(String deviceType){
            if(deviceType == null){
                return null;
            }
            if(deviceType.equalsIgnoreCase("DESKTOP")){
                return new Desktop();

            } else if(deviceType.equalsIgnoreCase("PHONE")){
                return new Phone();

            } else if(deviceType.equalsIgnoreCase("LAPTOP")){
                return new Laptop();
            }

            return null;
        }

    public static void main(String[] args) {
        Device device = DeviceFactory.getDevice("LAPTOP");
        device.priceRange();
        device.screenRange();
    }

}
