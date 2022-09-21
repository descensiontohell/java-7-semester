public class Rates { 
  private final String city; 
  private final Double price; 

  public Rates(String city, Double price) { 
    this.city = city; 
    this.price = price; 
  } 

  public String get_city() {
    return this.city;
  }

  public double get_price() {
    return this.price;
  }
}
