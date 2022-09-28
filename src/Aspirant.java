public class Aspirant extends Student {

  public Aspirant(String firstName, String lastName, String group, double mark) {
    super(firstName, lastName, group, mark);
  }

  public int getScholarship() {
    if (this.getAverageMark() == 5) {
      return 200;
    }
    return 180;
  }
}
