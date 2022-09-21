import java.util.Scanner;

public class FourthTask {
  private Scanner scanner;

  public FourthTask(Scanner sc) {
    this.scanner = sc;
    this.ask();
  }

  private void ask() {
    int result;
    System.out.println("Введите любое число:");
    int number = this.scanner.nextInt();

    if (number > 0) {
      result = number + 1;
    }
    else if (number < 0) {
      result = number - 2;
    }
    else {
      result = 10;
    }

    System.out.println("Результат: " + result);
  }
}
