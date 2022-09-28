import java.util.Arrays;

public class Phone {

  private String number;
  private String model;
  private int weight;

  public Phone(String model, String number, int weight) {
    this(model, weight);
    this.number = number;
  }

  public Phone(String model, int weight) {
    this.model = model;
    this.weight = weight;
    this.number = "+79990001122";
  }

  public Phone() {
    this.weight = 100;
    this.model = "foo";
    this.number = "+79996663344";
  }

  public void receiveCall(String callerName) {
    System.out.println(String.format("Звонит %s", callerName));
  }

  public void receiveCall(String callerName, String callerNumber) {
    System.out.println(String.format("Звонит %s с номером %s", callerName, callerNumber));
  }

  public void sendMessage(String... numbers) {
    System.out.println("Сообщение получат: " + String.join(", ", numbers));
  }
  
  public String getNumber() {
    return this.number;
  }

  public String getModel() {
    return this.model;
  }

  public int getWeight() {
    return this.weight;
  }
}
