public class StudentTask {
  public static Student[] getStudents() {
    Student[] students = {
      new Student("Ivan", "Ivanov", "БУТ1901", 5),
      new Student("Andrey", "Petrov", "БАП1901", 3.5),
      new Aspirant("Taras", "Tarasov", "БУТ1901", 5),
      new Student("Maksim", "Katz", "БАП1901", 4.1),
      new Aspirant("Matvey", "Veselov", "БУТ1901", 4.7),
    };
    return students;
  }

  public static void displayScholarship(Student[] students) {
    for (Student student : students) {
      System.out.println(student.getFirstName() + " " + student.getLastName() + " - " + student.getScholarship());
    }
  }
}
