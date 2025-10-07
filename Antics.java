public class Antics {
    public static boolean isPalindrome(String word){
        return true;
    }

    public static boolean isAbecedarian(String sentence){
        return true;
    }

    public static boolean isPangram(String sentence){
        return true;
    }

    public static String capitalizeFirstLetter(String sentence){
        char capitalized = Character.toUpperCase(sentence.charAt(0));
        String capitalizeFirstLetter = capitalized + sentence.substring(1);
        return capitalizeFirstLetter;
    }

}