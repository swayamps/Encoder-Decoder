public class Spark2Decoder {
    public static String shiftLetters(String input) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar >= 'a' && currentChar < 'z') {
                builder.append((char)(currentChar + 1));
            } else if (currentChar == 'z') {
                builder.append('a');
            } else {
                builder.append(currentChar);
            }
        }
        return builder.toString();
    }
}
