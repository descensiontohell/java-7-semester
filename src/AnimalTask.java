public class AnimalTask {
  public static Animal[] getAnimals() {
    Animal[] animals = {
      new Dog("Bone", "Moscow", 38),
      new Horse("Hay", "Kostroma", 1.5),
      new Cat("Ice cream", "Rotterdam", 70),
    };
    return animals;
  }

  public static void getAnimalsToVet(Vet vet, Animal[] animals) {
    for (Animal animal : animals) {
      vet.treatAnimal(animal);
    }
  }
}
