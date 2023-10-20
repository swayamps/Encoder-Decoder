public class ASCIIDecoder {
    public static String convertToPlainText(String asciiCode) {
        String[] codes = asciiCode.split(" ");
        StringBuilder plainText = new StringBuilder();
        for (String code : codes) {
            int asciiValue = Integer.parseInt(code);
            char decodedChar = (char) asciiValue;
            plainText.append(decodedChar);
        }

        return plainText.toString();
    }
}