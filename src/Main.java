
public class Main {
    public static void main(String[] args) {
        System.out.println(FirstStringTask.isPalindrome("sus"));  // true
        System.out.println(FirstStringTask.removeDuplicates("aaaammoguuus"));  // amogus
        System.out.println(FirstStringTask.isAnagram("amogus", "mosuga"));  // true
        System.out.println(FirstStringTask.compareLexicographically("amogus", "Mosuga"));  // First is less
        System.out.println(FirstStringTask.compareLexicographicallyRegardlessRegister("amogus", "Mosuga"));  // First is greater
        System.out.println(FirstStringTask.concatenateStrings("amo", "gus"));  // amogus
        System.out.println(FirstStringTask.doesStringEndWith("amogusus", "sus"));  // true
        System.out.println(FirstStringTask.doesEqual("amogus", "sus"));  // false
        System.out.println(FirstStringTask.getLength("amogus"));  // 6

        System.out.println(SecondStringTask.toLowercase("AmOgUs"));  // amogus
        System.out.println(SecondStringTask.toUppercase("AmOgUs"));  // AMOGUS
        System.out.println(SecondStringTask.getSecondMostFrequent("aaaammmmmmmoogus"));  // a
        System.out.println(SecondStringTask.getFirstUniqueCharacter("aammmmooguss"));  // g
        System.out.println(SecondStringTask.firstLastTwo("asfuisa"));  // true
        System.out.println(SecondStringTask.getAmountOfCharsThatRepeatThreeTimes("abdfaaflfdd"));  // 3
        System.out.println(SecondStringTask.sumOfDigitsInString("5fs7ifd3ds04"));  // 19
    }
}
