import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;

public class EighthTask {

  private Scanner scanner;
  private int[] array;

  public EighthTask(Scanner sc, int[] array) {
    this.scanner = sc;
    this.array = array;
    this.ask();
  }

  private void ask() {
    System.out.println("Исходный массив: " + Arrays.toString(this.array));
    System.out.println("Максимальное значение: " + Arrays.stream(this.array).max().getAsInt());
    System.out.println("Сумма положительных элементов: " + Arrays.stream(this.array).reduce(0, MathUtils::sum_positive));
    System.out.println("Сумма четных отрицательных элементов: " + Arrays.stream(this.array).reduce(0, MathUtils::sum_even_negative));
    System.out.println("Количество положительных элементов: " + Arrays.stream(this.array).reduce(0, MathUtils::count_positive));
    double average = Arrays.stream(this.array).reduce(0, MathUtils::sum_negative) / Arrays.stream(this.array).reduce(0, MathUtils::count_negative);
    System.out.println("Среднее арифметическоe отрицательных элементов: " + average);
  }
}
