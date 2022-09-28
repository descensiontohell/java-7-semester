public abstract class Animal {
  public String food;
  public String location;

  public String getFood() {
    return this.food;
  }

  public String getLocation() {
    return this.location;
  }

  public String getName() {
    return this.getClass().getSimpleName();
  }

  public void makeNoise() {
    System.out.println(
      String.format(
        "%s, находящийся в %s, шумит!",
        this.getName(),
        this.getLocation()
      )
    );
  }

  public void eat() {
    System.out.println(
      String.format(
        "%s, находящийся в %s, ест!",
        this.getName(),
        this.getLocation()
      )
    );
  }

  public void sleep() {
    System.out.println(
      String.format(
        "%s, находящийся в %s, спит!",
        this.getName(),
        this.getLocation()
      )
    );
  }
}
