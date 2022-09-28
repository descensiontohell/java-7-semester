public class PhoneTask {
  public static Phone[] getPhones() {
    Phone[] phones = {
      new Phone("iPhone 14", "+79268232233", 141),
      new Phone("Nothing Phone (1)", 121),
      new Phone(),
    };
    return phones;
  }
  
  public static void performTask(Phone[] phones) {
    for (Phone phone : phones) {
      System.out.println(String.format("%s %s %s", phone.getWeight(), phone.getModel(), phone.getNumber()));
    }
    Phone phone = phones[0];
    phone.sendMessage("+74231984378", "+317894321199", "+19288374344");
    phone.receiveCall("Антон");
    phone.receiveCall("Андрей", "+72223334499");
  }
}
