import java.util.Scanner;
import java.util.Arrays;

public class NinethTask {

  private int[] array;

  public NinethTask(Scanner sc, int[] array) {
    this.array = array;
    this.ask();
  }

  private void ask() {
    System.out.println("Исходный массив: " + Arrays.toString(this.array));

    int[] new_array = new int[this.array.length];

    for (int i = 0; i < this.array.length; i++) {
      new_array[i] = this.array[this.array.length - i - 1];
    }

    System.out.println("Перевернутый массив: " + Arrays.toString(new_array));
  }
}
