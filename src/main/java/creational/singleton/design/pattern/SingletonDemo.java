package creational.singleton.design.pattern;

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Singleton singleton3 = Singleton.getInstance();
        System.out.println(singleton1.hashCode() + " "+singleton2.hashCode() + " "+singleton3.hashCode());
    }
}
