
public class PigLatinConverter {
    public static String pigLatinize(String word) {
        String vowels = "aeiouAEIOU";
        if (word.length() == 0) {
            return word;
        }
        char firstChar = word.charAt(0);
        if (vowels.indexOf(firstChar) != -1) {
            return word + "ay";
        } else {
            return word.substring(1) + firstChar + "ay";
        }
    }
}