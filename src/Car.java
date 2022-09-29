public abstract class Car {
  private String brand;
  private String carClass;
  private Engine engine;
  private int weight;

  public Car(String brand, String carClass, Engine engine, int weight) {
    this.brand = brand;
    this.carClass = carClass;
    this.engine = engine;
    this.weight = weight;
  }

  public abstract void start();

  public abstract void stop();

  public String getBrand() {
    return this.brand;
  }

  public String getCarClass() {
    return this.carClass;
  }

  public Engine getEngine() {
    return this.engine;
  }

  public int getWeight() {
    return this.weight;
  }

  public void turnLeft() {
    System.out.println("Поворот налево");
  }

  public void turnRight() {
    System.out.println("Поворот направо");
  }

  public void printInfo() {
    System.out.println(
      String.format(
        "Автомобиль %s класса %s с двигателем %s мощностью %s",
        this.getBrand(),
        this.getCarClass(),
        this.getEngine().getBrand(),
        this.getEngine().getHorsePower()
      )
    );
  }
}
