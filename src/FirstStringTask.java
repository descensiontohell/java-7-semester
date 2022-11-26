import java.util.Arrays;

public class FirstStringTask {
    public static Boolean isPalindrome(String input){
        StringBuilder bldr = new StringBuilder();
        bldr.append(input);
        bldr.reverse();
        return bldr.toString().equals(input);
    }

    public static String removeDuplicates(String input){
        StringBuilder bldr = new StringBuilder();
        input.chars().distinct().forEach(c -> bldr.append((char) c));
        return bldr.toString();
    }

    public static Boolean isAnagram(String first, String second){
        if (first.length() != second.length()) {
            return false;
        }

        char[] a1 = first.toCharArray();
        char[] a2 = second.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        return Arrays.equals(a1, a2);
    }

    public static String compareLexicographically(String first, String second){
        String result;

        int value = first.compareTo(second);


        if (value < 0) {
            result = "First string is greater than the second one";
        } else if (value == 0) {
            result = "First string is equal to the second one";
        } else {
            result = "First string is less than the second one";
        }

        return result;
    }

    public static String compareLexicographicallyRegardlessRegister(String first, String second){
        String result;

        int value = first.toLowerCase().compareTo(second.toLowerCase());


        if (value < 0) {
            result = "First string is greater than the second one";
        } else if (value == 0) {
            result = "First string is equal to the second one";
        } else {
            result = "First string is less than the second one";
        }

        return result;
    }

    public static String concatenateStrings(String first, String second){
        return first + second;
    }

    public static boolean doesStringEndWith(String bigger, String smaller){
        return bigger.endsWith(smaller);
    }

    public static boolean doesEqual(String first, String second){
        return first.equals(second);
    }

    public static int getLength(String input){
        return input.length();
    }
}
