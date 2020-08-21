package behavioral.observer.desin.pattern;

/*
  Observer design pattern is a category of Behavioral pattern which defines a one-to-many
  dependency between objects so that one object changes state, all its dependencies are
  notified and updated automatically.

  Please implement Observer Design Pattern.

  To design this pattern, whatever number of classes needed, please feel free to
  implement those.
 */
public interface Observer {
  public void update(double ibmPrice, double aaplePrice, double googPrice);
}
