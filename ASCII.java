public class ASCII {
   public static String convertToAsciiCode(String plainText) {
       StringBuilder asciiCode = new StringBuilder();
       for (int i = 0; i < plainText.length(); i++) {
           int asciiValue = (int) plainText.charAt(i);
           asciiCode.append(asciiValue).append(" ");
       }

       return asciiCode.toString().trim();
   }
}