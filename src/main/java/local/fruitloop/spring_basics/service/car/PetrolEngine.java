package local.fruitloop.spring_basics.service.car;

public class PetrolEngine implements Engine {
  @Override
  public void start() {
    System.out.println("Car is using petrol engine.");
  }
}
