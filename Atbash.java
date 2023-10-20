public class Atbash {

  public static String encodeMessage(String message) {
    StringBuilder encodedMessage = new StringBuilder();
    for (char letter : message.toCharArray()) {
      int code = (int) 'z' - (int) letter + 97;
      encodedMessage.append((char) code);
    }
    return encodedMessage.toString();
  }
}
