public class MathUtils {

  public static int sum_positive(int a, int b) {
    if (b >= 0) {
      a = a + b;
    }
    return a;
  }

  public static int sum_negative(int a, int b) {
    if (b < 0) {
      a = a + b;
    }
    return a;
  }

  public static int sum_even_negative(int a, int b) {
    if (b % 2 == 0 && b < 0) {
      a = a + b;
    }
    return a;
  }

  public static int count_positive(int a, int b) {
    if (b > 0) {
      a = a + 1;
    }
    return a;
  }

  public static int count_negative(int a, int b) {
    if (b < 0) {
      a = a + 1;
    }
    return a;
  }
}
