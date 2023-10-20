import java.util.HashMap;

public class FrancisBaconCipherDecoder {
    public static String decodeBaconCipher(String baconCipher) {
        HashMap<String, Character> baconMap = new HashMap<>();
        baconMap.put("00000", 'A');
        baconMap.put("00001", 'B');
        baconMap.put("00010", 'C');
        baconMap.put("00011", 'D');
        baconMap.put("00100", 'E');
        baconMap.put("00101", 'F');
        baconMap.put("00110", 'G');
        baconMap.put("00111", 'H');
        baconMap.put("01000", 'I');
        baconMap.put("01001", 'J');
        baconMap.put("01010", 'K');
        baconMap.put("01011", 'L');
        baconMap.put("01100", 'M');
        baconMap.put("01101", 'N');
        baconMap.put("01110", 'O');
        baconMap.put("01111", 'P');
        baconMap.put("10000", 'Q');
        baconMap.put("10001", 'R');
        baconMap.put("10010", 'S');
        baconMap.put("10011", 'T');
        baconMap.put("10100", 'U');
        baconMap.put("10101", 'V');
        baconMap.put("10110", 'W');
        baconMap.put("10111", 'X');
        baconMap.put("11000", 'Y');
        baconMap.put("11001", 'Z');
        StringBuilder plainText = new StringBuilder();
        for (int i = 0; i < baconCipher.length(); i += 5) {
            String cipherGroup = baconCipher.substring(i, i + 5);
            char decodedChar = baconMap.get(cipherGroup);
            plainText.append(new String(new char[]{decodedChar}));
        }

        return plainText.toString();
    }
}