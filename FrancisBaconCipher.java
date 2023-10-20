import java.util.*;

public class FrancisBaconCipher {
   public static final Map<Character, String> ENCODING_TABLE;

   static {
      ENCODING_TABLE = new HashMap<>();
      ENCODING_TABLE.put('A', "00000");
      ENCODING_TABLE.put('B', "00001");
      ENCODING_TABLE.put('C', "00010");
      ENCODING_TABLE.put('D', "00011");
      ENCODING_TABLE.put('E', "00100");
      ENCODING_TABLE.put('F', "00101");
      ENCODING_TABLE.put('G', "00110");
      ENCODING_TABLE.put('H', "00111");
      ENCODING_TABLE.put('I', "01000");
      ENCODING_TABLE.put('J', "01001");
      ENCODING_TABLE.put('K', "01010");
      ENCODING_TABLE.put('L', "01011");
      ENCODING_TABLE.put('M', "01100");
      ENCODING_TABLE.put('N', "01101");
      ENCODING_TABLE.put('O', "01110");
      ENCODING_TABLE.put('P', "01111");
      ENCODING_TABLE.put('Q', "10000");
      ENCODING_TABLE.put('R', "10001");
      ENCODING_TABLE.put('S', "10010");
      ENCODING_TABLE.put('T', "10011");
      ENCODING_TABLE.put('U', "10100");
      ENCODING_TABLE.put('V', "10101");
      ENCODING_TABLE.put('W', "10110");
      ENCODING_TABLE.put('X', "10111");
      ENCODING_TABLE.put('Y', "11000");
      ENCODING_TABLE.put('Z', "11001");
   }

   public static String encode(String input) {
      StringBuilder output = new StringBuilder();
      for (char c : input.toUpperCase().toCharArray()) {
         String encodedChar = ENCODING_TABLE.get(c);
         if (encodedChar == null) {
            output.append(c);
         } else {
            output.append(encodedChar);
         }
      }
      return output.toString();
   }
}