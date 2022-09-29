public class SportsCar extends Car {
  private int maxSpeed;

  public SportsCar(String brand, String carClass, Engine engine, int weight, int maxSpeed) {
    super(brand, carClass, engine, weight);
    this.maxSpeed = maxSpeed;
  }

  public int getMaxSpeed() {
    return this.maxSpeed;
  }

  public void start() {
    System.out.println("Спорткар поехал");
  }

  public void stop() {
    System.out.println("Спорткар остановился");
  }
}
