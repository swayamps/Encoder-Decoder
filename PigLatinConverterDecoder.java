
public class PigLatinConverterDecoder {
    public static String unPigLatinize(String word) {
        if (word.length() <= 2 || !word.substring(word.length() - 2).equals("ay")) {
            return word;
        }
        String plainText = word.substring(0, word.length() - 2);
        char lastChar = plainText.charAt(plainText.length() - 1);
        if (Character.isUpperCase(lastChar)) {
            return Character.toUpperCase(plainText.charAt(0)) + plainText.substring(1, plainText.length() - 1) + Character.toLowerCase(lastChar);
        } else {
            return plainText.substring(0, plainText.length() - 1) + lastChar;
        }
    }
}