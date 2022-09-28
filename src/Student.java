public class Student {
  private String firstName;
  private String lastName;
  private String group;
  private double averageMark;

  public Student(String firstName, String lastName, String group, double mark) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.group = group;
    this.averageMark = mark;
  }

  public int getScholarship() {
    if (this.getAverageMark() == 5) {
      return 100;
    }
    return 80;
  }

  public double getAverageMark() {
    return this.averageMark;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public String getGroup() {
    return this.group;
  }
}
