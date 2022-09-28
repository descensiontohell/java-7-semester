public class Vet {
  private String name;

  public Vet(String name){
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void treatAnimal(Animal animal) {
    System.out.println(
      String.format(
        "%s пришел на прием. Ест %s, живет в %s",
        animal.getName(),
        animal.getFood(),
        animal.getLocation()
      )
    );
  }
}
