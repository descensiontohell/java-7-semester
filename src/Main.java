import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    if (args.length == 0) {
      throw new IOException("Вы не ввели число");
    }
    int task_number = Integer.parseInt(args[args.length-1]);
    Scanner sc = new Scanner(System.in);

    switch (task_number) {
      case 1:
        new FirstTask(sc);      
        break;

      case 2:
        new SecondTask(sc);
        break;

      case 3:
        new ThirdTask(sc);
        break;

      case 4:
        new FourthTask(sc);
        break;

      case 5:
        new FifthTask(sc);
        break;
      
      case 6:
        new SixthTask(sc);
        break;

      case 7:
        new SeventhTask(sc);
        break;

      case 8:
        int[] task8_array = {1, -10, 5, 6, 45, 23, 45, -34, 0, 32, 56, -1, 2, -2};
        new EighthTask(sc, task8_array);
        break;

      case 9:
        int[] task9_array = {15, 10, 51, 6, 5, 3, 10, -34, 0, 32, 56, 12, 24, 52};
        new NinethTask(sc, task9_array);
        break;

      case 10: 
        int[] task10_array = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, 52};
        new TenthTask(sc, task10_array);
        break;
    }
  }
}
