import java.util.Arrays;

public class SecondStringTask {
    public static String toLowercase(String input){
        return input.toLowerCase();
    }

    public static String toUppercase(String input){
        return input.toUpperCase();
    }


    public static char getSecondMostFrequent(String input){
        int[] array = new int[26];
        char[] char_array = input.toCharArray();

        for (char c : char_array) {
            int index = c - 'a';
            array[index]++;
        }

        int max = Arrays.stream(array).max().getAsInt();

        for (int i = 0; i < array.length; i++){
            if (array[i] == max){
                array[i] = 0;
                break;
            }
        }

        int new_max = Arrays.stream(array).max().getAsInt();

        for (int i = 0; i < array.length; i++){
            if (array[i] == new_max){
                return (char)(i+97);
            }
        }

        return '-';
    }

    private static int countChar(char ch, String input){
        int counter = 0;

        for (int i = 0; i < input.length(); i++){
            if (input.charAt(i) == ch){
                counter++;
            }
        }

        return counter;
    }

    public static char getFirstUniqueCharacter(String input){
        for (int i = 0; i < input.length(); i++){
            if (SecondStringTask.countChar(input.charAt(i), input) == 1){
                return input.charAt(i);
            }
        }

        return '-';
    }

    public static boolean firstLastTwo(String input){
        char first = input.charAt(0);
        char second = input.charAt(1);
        char predlast = input.charAt(input.length()-2);
        char last = input.charAt(input.length()-1);

        return (first == predlast && second == last) || (first == last && second == predlast);
    }

    public static Integer getAmountOfCharsThatRepeatThreeTimes(String input){
        int counter = 0;
        int[] array = new int[26];
        char[] char_array = input.toCharArray();

        for (char c : char_array) {
            int index = c - 'a';
            array[index]++;
        }

        for (int foo : array) {
            if (foo == 3){
                counter++;
            }
        }

        return counter;
    }

    public static Integer sumOfDigitsInString(String input){
        int result = 0;

        for (char c : input.toCharArray()){
            if (Character.isDigit(c)) {
                int digit = Character.getNumericValue(c);
                result = result + digit;
            }
        }

        return result;
    }
}
