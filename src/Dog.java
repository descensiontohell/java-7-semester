public class Dog extends Animal {
  private int maxSpeed;

  public Dog(String food, String location, int maxSpeed) {
    this.food = food;
    this.location = location;
    this.maxSpeed = maxSpeed;
  }

  public int getMaxSpeed() {
    return this.maxSpeed;
  }
}
