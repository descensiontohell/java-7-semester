public class Lorry extends Car {
  private int maxWeight;

  public Lorry(String brand, String carClass, Engine engine, int weight, int maxWeight) {
    super(brand, carClass, engine, weight);
    this.maxWeight = maxWeight;
  }

  public int getMaxWeight() {
    return this.maxWeight;
  }

  public void start() {
    System.out.println("Грузовик поехал");
  }

  public void stop() {
    System.out.println("Грузовик остановился");
  }
}
