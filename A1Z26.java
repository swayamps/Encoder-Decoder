
public class A1Z26 {

  public static String encodeMessage(String message) {
    StringBuilder encodedMessage = new StringBuilder();
    for (char letter : message.toCharArray()) {
      int code = (int) letter - 96;
      encodedMessage.append(code + " ");
    }
    return encodedMessage.toString().trim();
  }
}
