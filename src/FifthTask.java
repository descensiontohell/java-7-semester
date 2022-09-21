import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class FifthTask {
  private Scanner scanner;

  public FifthTask(Scanner sc) {
    this.scanner = sc;
    this.ask();
  }

  private void ask() {
    int[] numbers = new int[3];
    System.out.println("Введите три числa:");

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = this.scanner.nextInt();
    }

    int min = Arrays.stream(numbers).min().getAsInt();
    System.out.println("Минимальное число: " + min);
  }
}
