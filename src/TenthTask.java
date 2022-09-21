import java.util.Scanner;
import java.util.Arrays;

public class TenthTask {

  private int[] array;

  public TenthTask(Scanner sc, int[] array) {
    this.array = array;
    this.ask();
  }

  private void ask() {
    System.out.println("Исходный массив: " + Arrays.toString(this.array));

    int[] new_array = new int[this.array.length];

    int old = 0;
    int new_ = 0;

    while (old < this.array.length) {
      if (this.array[old] != 0) {
        new_array[new_] = this.array[old];
        new_++;
      }
      old++;
    }

    System.out.println("Массив с перемещенными нулями: " + Arrays.toString(new_array));
  }
}
