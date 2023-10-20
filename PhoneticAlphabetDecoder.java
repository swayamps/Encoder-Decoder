import java.util.HashMap;

public class PhoneticAlphabetDecoder {
    public static String decodePhoneticAlphabet(String phoneticAlphabet) {
        HashMap<String, Character> phoneticMap = new HashMap<>();
        phoneticMap.put("ALFA", 'A');
        phoneticMap.put("BRAVO", 'B');
        phoneticMap.put("CHARLIE", 'C');
        phoneticMap.put("DELTA", 'D');
        phoneticMap.put("ECHO", 'E');
        phoneticMap.put("FOXTROT", 'F');
        phoneticMap.put("GOLF", 'G');
        phoneticMap.put("HOTEL", 'H');
        phoneticMap.put("INDIA", 'I');
        phoneticMap.put("JULIETT", 'J');
        phoneticMap.put("KILO", 'K');
        phoneticMap.put("LIMA", 'L');
        phoneticMap.put("MIKE", 'M');
        phoneticMap.put("NOVEMBER", 'N');
        phoneticMap.put("OSCAR", 'O');
        phoneticMap.put("PAPA", 'P');
        phoneticMap.put("QUEBEC", 'Q');
        phoneticMap.put("ROMEO", 'R');
        phoneticMap.put("SIERRA", 'S');
        phoneticMap.put("TANGO", 'T');
        phoneticMap.put("UNIFORM", 'U');
        phoneticMap.put("VICTOR", 'V');
        phoneticMap.put("WHISKEY", 'W');
        phoneticMap.put("XRAY", 'X');
        phoneticMap.put("YANKEE", 'Y');
        phoneticMap.put("ZULU", 'Z');

        StringBuilder plainText = new StringBuilder();

        String[] words = phoneticAlphabet.split(" ");
        for (String word : words) {
            char decodedChar = phoneticMap.get(word.toUpperCase());
            plainText.append(decodedChar);
        }

        return plainText.toString();
    }
}