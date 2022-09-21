import java.util.Scanner;

public class FirstTask {

  private Scanner scanner;

  public FirstTask(Scanner sc) {
    this.scanner = sc;
    this.ask();
  }

  private void ask() {
    System.out.println("Введите число:");
    int number = this.scanner.nextInt();
    int last_digit = number % 10;
    System.out.println("Последняя цифра: " + last_digit);
  }
}
