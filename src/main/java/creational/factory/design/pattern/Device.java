package creational.factory.design.pattern;

/*
  Factory Pattern is a category of Creational pattern.

  In Factory Design Pattern, we create object without exposing the creation logic to client.

  Device is an interface, can be implemented into multiple concrete classes(Laptop,Phone,
  Desktop,Monitor,iPhone).

  Please implement Factory Design Pattern.

  To design this pattern, whatever number of classes needed, please feel free to
  implement those.
 */
public interface Device {
void screenRange();
void priceRange();
}
