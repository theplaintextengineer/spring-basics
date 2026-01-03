import local.fruitloop.spring_basics.service.car.Car;
import local.fruitloop.spring_basics.service.car.HydrogenFuelEngine;

void main() {
  var engine = new HydrogenFuelEngine();
  var car = new Car(engine);
  car.start();
}
