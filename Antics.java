/**
 * Lab 2 – String Antics
 * Description: This class has 4 string methods.
 * 1 isPalindrome: checks if a word or sentence reads the same backward.
 * 2 isAbecedarian: checks if the letters are in alphabetical order.
 * 3 isPangram: checks if a sentence or phrase contains all letters of the alphabet.
 * 4 capitalizeFirstLetter: capitalizes the first letter of the word, sentence, phrase, etc.
 *
 * @author Edisson Ajciginac (isPalindrome and isAbecedarian)
 * @author Jeron Montecillo (isPangram and capitalizeFirstLetter)
 * @since 2025-10-7
 */
public class Antics {

    /**
     * Checks if a word or sentence is a palindrome.
     * It ignores spaces, punctuation, and letter case.
     * Example: "Level" -> true, "Java" -> false
     *
     * @param text the word or sentence to check
     * @return true if the text reads the same backward
     */
    public static boolean isPalindrome(String text) {
        if (text == null) return false;

        // Convert all letters to lowercase
        String s = text.toLowerCase();
        StringBuilder clean = new StringBuilder();

        // Remove spaces and non-letter characters
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                clean.append(c);
            }
        }

        // Compare characters from start and end
        int i = 0, j = clean.length() - 1;
        while (i < j) {
            if (clean.charAt(i) != clean.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    /**
     * Checks if the letters in the word are in alphabetical order.
     * It ignores case and skips non-letter characters.
     * Example: "access" -> true, "biopsy" -> false
     *
     * @param text the word to check
     * @return true if all letters appear in alphabetical order
     */
    public static boolean isAbecedarian(String text) {
        if (text == null) return false;

        char prev = 0; // no previous letter yet
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            // Convert uppercase to lowercase
            if (c >= 'A' && c <= 'Z') {
                c = (char) (c - 'A' + 'a');
            }

            // Only check letters
            if (c >= 'a' && c <= 'z') {
                if (prev != 0 && c < prev) {
                    return false; // out of order
                }
                prev = c;
            }
        }

        // True if at least one letter was found
        return prev != 0;
    }

    /**
     * Tests if phrase/sentence contains all letters of the alphabet.
     * @param sentence
     * @return true if the phrase/sentence contains all letters of the alphabet otherwise returns false
     */
    public static boolean isPangram(String sentence){
        sentence = sentence.toLowerCase();
        boolean[] pangram = new boolean[26];
        int index = 0;
        if (sentence.length() < 26) {
            return false;
        } else {
            for (int i = 0; i < sentence.length(); i++) {
                char alphabet = sentence.charAt(i);

                if (alphabet >= 'a' && alphabet <= 'z') {
                    index = alphabet - 'a';
                    pangram[index] = true;
                }
            }
            
            boolean isPangram = true;
            for (boolean a : pangram) {
                if (!a) {
                    isPangram = false;
                    break;
                }
            }

            if (isPangram) {
                return true;
            } else {
                return false;
            }
        }

    }

    /**
     * Capitalizes the first letter in the sentence/phrase.
     * @param sentence
     * @return uppercase for the first letter
     */
    public static String capitalizeFirstLetter(String sentence){
        char capitalized = Character.toUpperCase(sentence.charAt(0));
        String capitalizeFirstLetter = capitalized + sentence.substring(1);
        return capitalizeFirstLetter;
    }
}
