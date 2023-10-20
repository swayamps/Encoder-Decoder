import java.util.HashMap;

public class Spark1Decoder {
    public static String decodeMorseCode(String morseCode) {
        HashMap<String, Character> morseCodeMap = new HashMap<>();
        morseCodeMap.put("!", 'A');
        morseCodeMap.put("@", 'B');
        morseCodeMap.put("#", 'C');
        morseCodeMap.put("$", 'D');
        morseCodeMap.put("%", 'E');
        morseCodeMap.put("^", 'F');
        morseCodeMap.put("&", 'G');
        morseCodeMap.put("*", 'H');
        morseCodeMap.put("(", 'I');
        morseCodeMap.put("!)", 'J');
        morseCodeMap.put("!!", 'K');
        morseCodeMap.put("!@", 'L');
        morseCodeMap.put("!#", 'M');
        morseCodeMap.put("!$", 'N');
        morseCodeMap.put("!%", 'O');
        morseCodeMap.put("!^", 'P');
        morseCodeMap.put("!&", 'Q');
        morseCodeMap.put("!*", 'R');
        morseCodeMap.put("!(",'S');
        morseCodeMap.put("@)", 'T');
        morseCodeMap.put("@!", 'U');
        morseCodeMap.put("@@", 'V');
        morseCodeMap.put("@#", 'W');
        morseCodeMap.put("@$", 'X');
        morseCodeMap.put("@%", 'Y');
        morseCodeMap.put("@^", 'Z');
        morseCodeMap.put("1", '1');
        morseCodeMap.put("2", '2');
        morseCodeMap.put("3", '3');
        morseCodeMap.put("4", '4');
        morseCodeMap.put("5", '5');
        morseCodeMap.put("6", '6');
        morseCodeMap.put("7", '7');
        morseCodeMap.put("8", '8');
        morseCodeMap.put("9", '9');
        morseCodeMap.put("0", '0');
        StringBuilder plainText = new StringBuilder();
        String[] codes = morseCode.split(" ");

        for (String code : codes) {
            Character character = morseCodeMap.get(code);
            if (character == null) {
                character = ' ';
            }
            plainText.append(character);
        }

        return plainText.toString();
    }
}