import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class SixthTask {
  private Scanner scanner;

  public SixthTask(Scanner sc) {
    this.scanner = sc;
    this.ask();
  }

  private boolean is_even(int number) {
    return number % 2 == 0;
  }

  private void ask() {
    String is_even;
    String is_positive_or_negative = "";

    System.out.println("Введите целое числo:");
    int number = this.scanner.nextInt();

    if (number == 0) {
      is_even = "";
      is_positive_or_negative = "нулевое ";
    }
    else if (this.is_even(number)) {
      is_even = "четное ";
    }
    else {
      is_even = "нечетное ";
    }

    if (number > 0) {
      is_positive_or_negative = "положительное ";
    }
    else if (number < 0) {
      is_positive_or_negative = "отрицательное "; 
    }

    System.out.println(is_even + is_positive_or_negative + "число");
  }
}
