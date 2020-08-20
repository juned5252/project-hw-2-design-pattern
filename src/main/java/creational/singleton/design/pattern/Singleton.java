package creational.singleton.design.pattern;

/*
  Singleton Pattern is a category of Creational pattern.

  Singleton design solution is where an application wants to have
  one and only one instance of any class.

  Please implement Singleton Design Pattern.

 */
public class Singleton {
    private static Singleton singleton = null;

    private Singleton() {
    }

    public static synchronized Singleton getInstance(){
        if (singleton == null){
            singleton = new Singleton();
        }
            return singleton;
    }

}
