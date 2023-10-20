public class PhoneticAlphabetConverter {

  private static final String[] phoneticAlphabet = new String[] {
    "Alfa", "Bravo", "Charlie", "Delta", "Echo",
    "Foxtrot", "Golf", "Hotel", "India", "Juliett",
    "Kilo", "Lima", "Mike", "November", "Oscar",
    "Papa", "Quebec", "Romeo", "Sierra", "Tango",
    "Uniform", "Victor", "Whiskey", "X-ray", "Yankee",
    "Zulu"
  };

  public static String convertToPhoneticAlphabet(String input) {
    input = input.toLowerCase();
    StringBuilder phonetic = new StringBuilder();
    for (int i = 0; i < input.length(); i++) {
      char currentChar = input.charAt(i);
      if (currentChar >= 'a' && currentChar <= 'z') {
        int index = currentChar - 'a';
        phonetic.append(phoneticAlphabet[index] + " ");
      } else {
        phonetic.append(currentChar + " ");
      }
    }
    return phonetic.toString();
  }
}