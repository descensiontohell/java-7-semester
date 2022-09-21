import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;

public class SeventhTask {

  private Scanner scanner;

  public SeventhTask(Scanner sc) {
    this.scanner = sc;
    this.ask();
  }

  private Hashtable<Integer, Rates> get_rates() {
    Hashtable<Integer, Rates> prices = new Hashtable<Integer, Rates>();
    prices.put(905, new Rates("Москва", 4.15));
    prices.put(194, new Rates("Ростов", 1.98));
    prices.put(491, new Rates("Краснодар", 2.69));
    prices.put(800, new Rates("Киров", 5.00));
    return prices;
  }

  private void ask() {
    System.out.println("Введите код города:");
    System.out.println("Москва - 905");
    System.out.println("Ростов - 194");
    System.out.println("Краснодар - 491");
    System.out.println("Киров - 800");

    Hashtable<Integer, Rates> rates = this.get_rates();
    int city_code = this.scanner.nextInt();

    Rates rate = rates.get(city_code);
    double price = rate.get_price();
    String city = rate.get_city();

    System.out.println(city + ". Стоимость разговора: " + price*10);
  }
}
