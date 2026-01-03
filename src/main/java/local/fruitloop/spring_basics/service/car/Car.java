package local.fruitloop.spring_basics.service.car;

public class Car {
  private final Engine engine;

  public Car(Engine engine) {
    this.engine = engine;
  }

  public void start() {
    this.engine.start();
  }
}
