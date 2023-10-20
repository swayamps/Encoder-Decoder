import java.util.HashMap;

public class Spark1 {
  private static final HashMap<Character, String> morseCodeMap = new HashMap<>();

  static {
    morseCodeMap.put('A', "!");
    morseCodeMap.put('B', "@");
    morseCodeMap.put('C', "#");
    morseCodeMap.put('D', "$");
    morseCodeMap.put('E', "%");
    morseCodeMap.put('F', "^");
    morseCodeMap.put('G', "&");
    morseCodeMap.put('H', "*");
    morseCodeMap.put('I', "(");
    morseCodeMap.put('J', "!)");
    morseCodeMap.put('K', "!!");
    morseCodeMap.put('L', "!@");
    morseCodeMap.put('M', "!#");
    morseCodeMap.put('N', "!$");
    morseCodeMap.put('O', "!%");
    morseCodeMap.put('P', "!^");
    morseCodeMap.put('Q', "!&");
    morseCodeMap.put('R', "!*");
    morseCodeMap.put('S', "!(");
    morseCodeMap.put('T', "@)");
    morseCodeMap.put('U', "@!");
    morseCodeMap.put('V', "@@");
    morseCodeMap.put('W', "@#");
    morseCodeMap.put('X', "@$");
    morseCodeMap.put('Y', "@%");
    morseCodeMap.put('Z', "@^");
    morseCodeMap.put('1', "1");
    morseCodeMap.put('2', "2");
    morseCodeMap.put('3', "3");
    morseCodeMap.put('4', "4");
    morseCodeMap.put('5', "5");
    morseCodeMap.put('6', "6");
    morseCodeMap.put('7', "7");
    morseCodeMap.put('8', "8");
    morseCodeMap.put('9', "9");
    morseCodeMap.put('0', "0");
  }

  public static String convertToMorseCode(String input) {
    input = input.toUpperCase();
    StringBuilder morseCode = new StringBuilder();
    for (int i = 0; i < input.length(); i++) {
      char currentChar = input.charAt(i);
      if (morseCodeMap.containsKey(currentChar)) {
        morseCode.append(morseCodeMap.get(currentChar)).append(" ");
      }
    }
    return morseCode.toString();
  }
}