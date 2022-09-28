public class Main {
  public static void main(String[] args) {
    StudentTask.displayScholarship(StudentTask.getStudents());

    AnimalTask.getAnimalsToVet(new Vet("Антон"), AnimalTask.getAnimals());

    PhoneTask.performTask(PhoneTask.getPhones());
  }
}
