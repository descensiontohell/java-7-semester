public class Horse extends Animal {
  private double horsePower;

  public Horse(String food, String location, double horsePower) {
    this.food = food;
    this.location = location;
    this.horsePower = horsePower;
  }

  public double getHorsePower() {
    return this.horsePower;
  }
}
