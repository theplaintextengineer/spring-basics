package local.fruitloop.spring_basics.service.car;

public class HydrogenFuelEngine implements Engine {
  @Override
  public void start() {
    System.out.println("Car is using hydrogen fuel engine.");
  }
}
