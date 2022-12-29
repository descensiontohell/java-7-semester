import java.util.Scanner;
import java.util.HashMap;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) { //Initialization of the shop and main menu
        //Init variables, lists and catalog
        HashMap<String, String> loginpasswords = new HashMap<String, String>();
        LinkedList<Item> itemList = new LinkedList<Item>();
        loginpasswords.put("admin", "admin");
        boolean loggedIn = false;

        // Welcome screen
        System.out.println("Internet Shop");
        System.out.println("type Login to sign in or Register to sign up");
        Scanner in = new Scanner(System.in);

        itemList = setAssortment(itemList);
        HashMap<Item, Integer> cart = new HashMap<Item, Integer>();

        while (true) {
            String currentCommand = in.nextLine();

            //Register method, if successful will redirect to login menu.
            if (!loggedIn && currentCommand.equals("Register")) {
                Object[] registervalues = new Object[2];
                registervalues = register(loginpasswords, in);
                loginpasswords = (HashMap<String, String>) registervalues[0];
                if ((boolean) registervalues[1]) {
                    currentCommand = "Login";
                    loggedIn = true;
                    break;
                }
            }

            //Login method call
            else if (!loggedIn && currentCommand.equals("Login")) {
                boolean loginsuccess = login(loginpasswords, in);
                if (loginsuccess) {
                    loggedIn = true;
                    break;
                }
            }


            else {
                System.out.println("Enter correct command");
            }
        }

        boolean doPrint = true;

        // After user logged in
        while (true) {
            if (doPrint) {
                System.out.println();
                System.out.println("You are now in the shop catalogue.");
                System.out.println("If you wish to view assortment, type View.");
                System.out.println("If you wish to view your shopping cart, type Cart.");
                System.out.println("If you wish to log out, type anything.");
            }

            String currentCommand = in.nextLine();
            doPrint = true;

            if (currentCommand.equals("View")) {
                chooseAssortment(itemList, cart, in);
            }

            else if (currentCommand.equals("Cart")) {
                viewCart(itemList, cart, in);
            }
            else if (currentCommand.length() > 0){
                break;
            }
            else {
                doPrint = false;
            }
        }
    }

    //Register method. Takes the hashmap with login-password couples and the scanner from main.
    //Will ask the user to input a login, and if such string does not exist, 
    //asks to input a password. Then creates a couple login-password in hashmap.
    //Returns an object array, where 0th is the new loginpasswords hashmap, and
    //1st is the result of the operation (true/false) aka success/fail.
    public static Object[] register(HashMap<String, String> loginpasswords, Scanner in) {
        //User input
        System.out.println("Registration");
        System.out.println("Enter login");
        String login = in.nextLine();
        boolean registerState = false;

        Object[] returnvalues = new Object[2];

        if (loginpasswords.containsKey(login)) {
            //failed to create a user, returns to main method
            System.out.println("Such login exists");
            returnvalues[0] = loginpasswords;
            returnvalues[1] = registerState;
            return returnvalues;
        }
        System.out.println("Enter password");
        String password = in.nextLine();

        //create new user 
        loginpasswords.put(login, password);
        registerState = true;
        returnvalues[0] = loginpasswords;
        returnvalues[1] = registerState;
        return returnvalues;
    }

    // Login. Takes the hashmap with login-password couples and the scanner from main.
    // Will ask the user to input a login, and if such string does exist in the loginpassword
    // hashmap, then ask the password. If it's true, log in the user.
    // If anything fails asks the user if they want to retry, then calls login method again.
    // Returns a boolean that is the result of the operation (true/false) aka success/fail.
    public static boolean login(HashMap<String, String> loginpasswords, Scanner in) {
        System.out.println("Enter login");
        String login = in.nextLine();
        if (loginpasswords.containsKey(login)) {
            System.out.println("Enter password");
            String password = in.nextLine();
            if (loginpasswords.get(login).equals(password)) {
                System.out.println("Login successful");
                return true;
            } else {
                System.out.println("Password incorrect");
                System.out.println("Login failed. Would you like to try again? Y/N");
                String currentCommand = in.nextLine();
                if (currentCommand.equals("Y")) {
                    login(loginpasswords, in);
                } else {
                    return false;
                }

            }
        } else {
            System.out.println("Such user does not exist");
            System.out.println("Login failed. Would you like to try again? Y/N");
            String currentCommand = in.nextLine();
            if (currentCommand.equals("Y")) {
                login(loginpasswords, in);
            } else {
                return false;
            }

        }
        return false;

    }

    public static LinkedList<Item> setAssortment(LinkedList<Item> itemList) {
        Item itemMilk = new Item("Milk", "A dairy product", 5, 4);
        Item itemBoxes = new Item("Box", "A 1mx1mx1m cardboard box", 6, 10);
        Item itemCookies = new Item("Cookies box", "A 500g box of cookies", 8, 6);
        itemList.add(itemMilk);
        itemList.add(itemBoxes);
        itemList.add(itemCookies);
        return itemList;
    }

    public static void chooseAssortment(LinkedList<Item> itemList, HashMap<Item, Integer> cart, Scanner in) {
        Item currentItem;

        for (int i = 0; i < itemList.size(); i++) {
            System.out.print("Product number: ");
            System.out.println(i);
            currentItem = itemList.get(i);
            currentItem.printItem();
        }

        System.out.print("If you wish to add a product to your cart, input the product number. ");
        System.out.println("Otherwise type anything to exit.");
        String currentCommand = in.nextLine();
        Integer intCommand = 0;
        boolean isNumber = false;

        try {
            intCommand = Integer.parseInt(currentCommand);
            isNumber = true;
        }
        catch (NumberFormatException ex) {
            isNumber = false;
        }

        if (isNumber) {
            if (intCommand < itemList.size() && intCommand >= 0) {
                currentItem = itemList.get(intCommand);
                System.out.println("Input number of the amount you wish to get.");
                intCommand = in.nextInt();
                if (intCommand <= currentItem.numAvailable) {
                    cart.put(currentItem, intCommand);
                    System.out.println("The product has been successfully put in the cart.");
                } else {
                    System.out.println("The amount you chose is more than available.");
                }
            } else {
                System.out.println("Product number is incorrect.");
            }
        }
    }

    public static void viewCart(LinkedList<Item> itemList, HashMap<Item, Integer> cart, Scanner in) {
        for (Item item : cart.keySet()) {
            String thingName = item.name;
            int amount = cart.get(item);
            System.out.println("Product: " + thingName + ", amount: " + amount);
        }
    }
}
