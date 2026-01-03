package local.fruitloop.spring_basics.service.car;

public class Car {
  private PetrolEngine petrolEngine = new PetrolEngine();

  public void start() {
    petrolEngine.ignite();
  }
}
