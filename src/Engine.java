public class Engine {
  private int horsePower;
  private String brand;

  public Engine(String brand, int horsePower) {
    this.brand = brand;
    this.horsePower = horsePower;
  }

  public String getBrand() {
    return this.brand;
  }

  public int getHorsePower() {
    return this.horsePower;
  }
}
