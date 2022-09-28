public class Cat extends Animal {
  private int meowVolume;

  public Cat(String food, String location, int meowVolume) {
    this.food = food;
    this.location = location;
    this.meowVolume = meowVolume;
  }

  public double getMeowVolume() {
    return this.meowVolume;
  }
}
