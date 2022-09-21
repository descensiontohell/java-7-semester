import java.util.Arrays;
import java.util.Scanner;

public class SecondTask {
  private Scanner scanner;

  public SecondTask(Scanner sc) {
    this.scanner = sc;
    this.ask();
  }

  private void ask() {
    int[] digits = new int[3];

    System.out.println("Введите целое трехзначное число:");
    int number = this.scanner.nextInt();

    for (int i = 0; i < digits.length; i++) {
      int current = number % 10;
      digits[i] = current;
      number = number / 10;
    }
    int sum = Arrays.stream(digits).sum();

    System.out.println("Сумма цифр: " + sum);
  }
}
